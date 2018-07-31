package j2se8.ch8;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ForEach
{
	public static void main(String[] args)
	{
		List names=Arrays.asList("Alex","Allen","Alex");
		ForEach(names);
		ForEach(new HashSet(names));
		ForEach(new ArrayDeque(names));
		names.forEach(name->System.out.println(name));
		new HashSet(names).forEach(name->System.out.println(name));
		new ArrayDeque(names).forEach(name->System.out.println(name));
		names.forEach(System.out::println);
	}
	
	static void ForEach(Iterable iterable)
	{
		System.out.println("====(I)STRT====");
		for(Object o:iterable)
		{
			System.out.println(o);
		}
		System.out.println("====(I)FINE====");
	}
	
	static void forEach(Collection collection)
	{
		System.out.println("====(C)STRT====");
		for(Object o:collection)
		{
			System.out.println(o);
		}
		System.out.println("====(C)FINE====");
		
	}

	
}
