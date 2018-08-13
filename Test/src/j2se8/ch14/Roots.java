package j2se8.ch14;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Roots
{

	public static void main(String[] args)
	{
		Iterable<Path> dirs=FileSystems.getDefault().getRootDirectories();
		dirs.forEach(System.out::println);
	}

}
