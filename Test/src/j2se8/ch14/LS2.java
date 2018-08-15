package j2se8.ch14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class LS2
{

	public static void main(String[] args) throws IOException
	{
		String syntax="glob";
		String pattern="*.{txt,xml}";
		System.out.printf("Syntas=%s,Pattern=%s %n",syntax,pattern);
		
		Path userPath=Paths.get(System.getProperty("user.dir"));
		PathMatcher pathMacher=FileSystems.getDefault().getPathMatcher(syntax+":"+pattern);
		try(DirectoryStream<Path> directoryStream=Files.newDirectoryStream(userPath))
		{
			directoryStream.forEach(p->{
				Path file=Paths.get(p.getFileName().toString());
				if(pathMacher.matches(file))
					System.out.println(file.getFileName());
			});
		}
		
	}

}
