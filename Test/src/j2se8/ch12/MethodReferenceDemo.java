package j2se8.ch12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Person
{
	String name;
	Person (String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return String.format("Person {name=%s}", name);
	}
}

public class MethodReferenceDemo
{
	static <SRC,DST> List<DST> map(List<SRC> list,Function<SRC,DST> mapper)
	{
		List<DST> result=new ArrayList<>();
		for(int i=0;i<list.size();i++)
			result.add(mapper.apply(list.get(i)));
		return result;
	}

	public static void main(String[] args)
	{
		String[] args1={"a1","b11","c111"};
		List<String> l1=Arrays.asList(args1);
		l1.forEach(x->System.out.println(x));
		
//		List<String> names=Arrays.asList(args1);
//		List<Person> p0= map(names,name->new Person(name));
//		p0.forEach(System.out::println);
//		List<Person> p1= map(names,n->new Person(n));
//		List<Person> persons=map(names,Person::new);
//		persons.forEach(System.out::println);
	}

}
