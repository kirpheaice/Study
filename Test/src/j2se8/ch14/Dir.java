package j2se8.ch14;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Dir
{

	public static void main(String[] args) throws Exception
	{
		try(DirectoryStream<Path> directoryStream=Files.newDirectoryStream(Paths.get("/")))
		{
			List<String> files=new ArrayList<>();
			for(Path p : directoryStream)
			{
				if(Files.isDirectory(p))
					System.out.printf("Directory Name :%s %n",p.getFileName());
				else
					files.add(p.getFileName().toString());
			}
			System.out.println("\n<File names>:");
			files.forEach(System.out::println);
		}

	}

}
