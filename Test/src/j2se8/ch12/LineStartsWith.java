package j2se8.ch12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class LineStartsWith
{
	public static void main(String[] args) throws Exception
	{
		String fileName="/Users/jimlu/Documents/workspace/Test02/src/Test02.java";
		String prefix="public class";
//		Paths.get(fileName).forEach(System.out::println);
//		Files.lines(Paths.get(fileName)).forEach(System.out::println);
		Optional<String> result=Files.lines(Paths.get(fileName)).filter(line->line.startsWith(prefix)).findFirst();
//		Optional<String> result=Files.lines("/Users/jimlu/Documents/workspace/Test02/src")
//		
		System.out.println(result.orElse("No matched line"));
	}
}
