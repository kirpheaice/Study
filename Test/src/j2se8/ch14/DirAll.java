package j2se8.ch14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirAll
{

	public static void main(String[] args) throws IOException
	{
		try(DirectoryStream<Path> directoryStream=
				Files.newDirectoryStream(Paths.get("/Users/jimlu/Desktop"),
						"*.{txt,png}"))
		{
			directoryStream.forEach(p->System.out.println(p.getFileName()));
		}
	}
	static void walk() throws IOException
	{
		try(Stream<Path> p=Files.walk(Paths.get("/Users/jimlu/Desktop")))
		{
			p.forEach(System.out::println);
		}
	}
	static void list() throws IOException
	{
		try(Stream<Path> path=Files.list(Paths.get("/Users/jimlu/Desktop")))
		{
			path.forEach(System.out::println);
		}
	}

	static void f1423()throws IOException
	{
		Files.walkFileTree(Paths.get("/Users/jimlu/Desktop"), new ConsoleFileVisitor());
	}
}
