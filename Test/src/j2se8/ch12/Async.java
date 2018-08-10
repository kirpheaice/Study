package j2se8.ch12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Async
{
	public static CompletableFuture<String> readFileAsync(
			String fileName,ExecutorService service)
	{
		return CompletableFuture.supplyAsync(()->
		{
			try
			{
				return new String(Files.readAllBytes(Paths.get(fileName)));
			}
			catch(IOException ex)
			{
				throw new RuntimeException(ex);
			}
		},service);
	}
	
	public static void main(String[] args) throws Exception
	{
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		String fileName="/Volumes/MicroSD128/Project/012.TFB/2016/AScore/SCORE_QRY_20160926_56.txt";
		
		readFileAsync(fileName,service)
		.thenApplyAsync(String::toLowerCase)
		.whenComplete((ok,ex)->{
			if(ex==null)
				System.out.println(ok);
			else
				ex.printStackTrace();
		}).join();
		
		service.shutdown();
		
	}

}
