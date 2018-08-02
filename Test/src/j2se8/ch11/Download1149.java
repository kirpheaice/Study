package j2se8.ch11;

import java.net.URL;

public class Download1149
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
		
		new Pages1147(urls,fileNames,new ThreadPerTaskExecutor()).download();

	}

}
