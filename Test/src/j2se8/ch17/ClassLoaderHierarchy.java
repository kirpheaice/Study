package j2se8.ch17;

import java.util.Arrays;
import java.util.List;

public class ClassLoaderHierarchy
{

	public static void main(String[] args)
	{
		
		List<Integer> tmpList=Arrays.asList(42);
		System.out.println(tmpList.get(0));
//		f();
	}

	public static void f()
	{
		System.out.println("0");
		Some some=new Some();
		Class clz=some.getClass();
		ClassLoader loader=clz.getClassLoader();
		System.out.println("1");
		System.out.println(loader);
		System.out.println("2");
		System.out.println(loader.getParent());
		System.out.println("3");
		System.out.println(loader.getParent().getParent());
		System.out.println("4");

	}
}
