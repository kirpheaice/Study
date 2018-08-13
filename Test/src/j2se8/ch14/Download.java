package j2se8.ch14;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Download
{

	public static void main(String[] args) throws Exception
	{
		f14191();
	}
	
	static void f14191() throws Exception
	{
		try(Stream<String> lines=Files.lines(Paths.get("/Users/jimlu/Documents/123.txt")))
		{
			lines.forEach(System.out::println);
		}
	}
	
	static void f1418() throws Exception
	{
		URL url=new URL("http://openhome.cc");
		Path p1=Paths.get("/Users/jimlu/Documents/123.txt");
		Path p2=Paths.get("/Users/jimlu/Documents/234.txt");
//		Files.copy(url.openStream(), p,StandardCopyOption.REPLACE_EXISTING);
		Files.copy(url.openStream(), p2,StandardCopyOption.REPLACE_EXISTING);
//		System.out.println(Files.exists(p1));
		
	}

}
