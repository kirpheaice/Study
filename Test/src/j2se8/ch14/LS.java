package j2se8.ch14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LS
{

	public static void main(String[] args) throws IOException
	{
	}

	static void f1426() throws IOException
	{
		DirectoryStream.Filter<Path> f=new DirectoryStream.Filter<Path>()
		{
			public boolean accept(Path p) throws IOException
			{
				return Files.isDirectory(p);
			}
		};
		try(DirectoryStream<Path> p=Files.newDirectoryStream(Paths.get("/Users/jimlu/Desktop"),f))
		{
			p.forEach(x->System.out.println(x.getFileName()));
		}
	}
	static void ls() throws IOException
	{
		String glob="*";
		
		Path path=Paths.get(System.getProperty("user.dir"));
		System.out.println(path);
		try(DirectoryStream<Path> ds=Files.newDirectoryStream(path,glob))
		{
			ds.forEach(x->System.out.println(x.getFileName()));
		}
		
	}
}
