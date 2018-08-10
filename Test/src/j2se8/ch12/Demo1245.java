package j2se8.ch12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1245
{

	public static void main(String[] args)
	{
		func1245();
	}
	
	public static void func1245()
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> bt5=numbers.parallelStream().filter(a->a>5).collect(Collectors.toList());
		bt5.forEach(System.out::println);
		List<Integer> alsoLt=bt5.parallelStream().map(a->a+10).collect(Collectors.toList());
		alsoLt.forEach(System.out::println);
	}

	public static void func1244()
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> alsoLt=new ArrayList<>();
		
		for(Integer number:numbers)
		{
			if(number>5)
			{
				alsoLt.add(number+10);
				System.out.println(number);
			}
		}
	}
}
