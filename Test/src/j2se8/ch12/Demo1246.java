package j2se8.ch12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;

public class Demo1246
{
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	static String fileName="/Volumes/MicroSD128/Project/012.TFB/2016/AScore/SCORE_QRY_20160926_56.txt";

	public static void main(String[] args) throws Exception
	{
		System.out.printf("[%s] b4.%n",sdf.format(new Date()));
//		String x=new String(Files.readAllBytes(Paths.get(fileName)));
//		System.out.printf("[%s] done.%n",sdf.format(new Date()));
		fx();
	}
	
	public static void fx() throws Exception
	{
		Future<?> f=readFileAsync(fileName,
				System.out::println,
//				System.out::println,
//				content->System.out.println(content),
				a->a.printStackTrace(),
				Executors.newFixedThreadPool(10));
		while(!f.isDone())
		{
			System.out.printf("[%s] not yet.%n",sdf.format(new Date()));
			Thread.sleep(1);
		}
		System.out.printf("[%s] Done!%n",sdf.format(new Date()));
	}
	
	public static Future readFileAsync(String file,Consumer<String> success,Consumer<IOException> fail,ExecutorService service)
	{
		return service.submit(()->{
			try
			{
				success.accept(new String(Files.readAllBytes(Paths.get(file))));
			}
			catch(IOException ex)
			{
				fail.accept(ex);
			}
		});
	}
}
