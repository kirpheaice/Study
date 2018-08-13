package j2se8.ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo
{

	public static void main(String[] args)
	{
//		f1411();
//		f1412();
		f1413();
	}
	static void f1413()
	{
		Path p1=Paths.get(System.getProperty("user.home"), "Document1s");
		Path p2=Paths.get("/var/log");
		Path p1top2=p1.relativize(p2);
		System.out.println(p1top2);
		System.out.println(Files.exists(p1));
	}
	
	static void f1412()
	{
		Path path=Paths.get(System.getProperty("user.home"),"Documents","Downloads");
		path.forEach(System.out::println);
	}
	
	static void f1411()
	{
		Path path=Paths.get(System.getProperty("user.home"),"Documents","Downloads");
//		path.forEach(System.out::println);
		System.out.printf("toString    : %s %n",path);
		System.out.printf("getFileName : %s %n",path.getFileName());
		System.out.printf("getName(0)  : %s %n",path.getName(0));
		System.out.printf("getName(0)  : %s %n",path.getName(1));
		System.out.printf("getNameCount: %d %n",path.getNameCount());
		System.out.printf("subpath(0,2): %s %n",path.subpath(0, 2));
		System.out.printf("subpath(0,3): %s %n",path.subpath(0, 3));
		System.out.printf("getParent   : %s %n",path.getParent());
		System.out.printf("getRoot     : %s %n",path.getRoot());
	}
	
}
