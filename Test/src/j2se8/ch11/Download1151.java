package j2se8.ch11;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Download1151
{

	public static void main(String[] args) throws Exception
	{
		URL[] urls=
		{
			new URL("http://openhome.cc/Gossip/Encoding/"),
			new URL("http://openhome.cc/Gossip/Scala/"),
			new URL("http://openhome.cc/Gossip/JavaScript/"),
			new URL("http://openhome.cc/Gossip/Python/"),
		};
		String[] fileNames={"Encoding.txt","Scala.txt","JavaScript.txt","Python.txt"};

		ExecutorService executorService=Executors.newCachedThreadPool();
		new Pages1147(urls,fileNames,executorService).download();
		executorService.shutdown();
	}

}
