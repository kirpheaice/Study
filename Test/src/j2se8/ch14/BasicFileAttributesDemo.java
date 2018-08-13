package j2se8.ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class BasicFileAttributesDemo
{

	public static void main(String[] args) throws Exception
	{
//		f1414();
		f1415();
	}

	static void f1415() throws Exception
	{
		Path file=Paths.get("/usr/bin/jar");
		Map<String,Object> attrs=Files.readAttributes(file,"size,lastModifiedTime");
		System.out.println(attrs.get("size"));
	}
	static void f1414() throws Exception
	{
		Path file=Paths.get("/usr/bin/jar");
		BasicFileAttributes attrs=Files.readAttributes(file, BasicFileAttributes.class);
		System.out.printf("Creation Time   : %s %n",attrs.creationTime());
		System.out.printf("Last Access Time: %s %n",attrs.lastAccessTime());
		System.out.printf("Last Modify Time: %s %n",attrs.lastModifiedTime());
		System.out.printf("Is Directory    : %s %n",attrs.isDirectory());
		System.out.printf("Is Other        : %s %n",attrs.isOther());
		System.out.printf("Is Regular File : %s %n",attrs.isRegularFile());
		System.out.printf("Is Symbolic Link: %s %n",attrs.isSymbolicLink());
		System.out.printf("Size            : %s %n",attrs.size());
	}
}
