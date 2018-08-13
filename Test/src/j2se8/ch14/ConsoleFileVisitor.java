package j2se8.ch14;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ConsoleFileVisitor extends SimpleFileVisitor<Path>
{
	@Override
	public FileVisitResult preVisitDirectory(Path path,BasicFileAttributes attrs) throws IOException
	{
		printSpace(path);
		System.out.printf("[%s]%n",path.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFile(Path path,BasicFileAttributes attrs)
	{
		printSpace(path);
		System.out.printf("%s%n",path.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	@Override
	public FileVisitResult visitFileFailed(Path path, IOException e)
	{
		System.err.println(e);
		return FileVisitResult.CONTINUE;
	}
	private void printSpace(Path path)
	{
		System.out.printf("%"+path.getNameCount()*2+"s","-");
	}
}
