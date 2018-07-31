package j2se8.ch9;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Students2
{
	public static void main(String[] args)
	{
		Set students=new HashSet();
		students.add(new Student2("Alex","A01"));
		students.add(new Student2("Alex","A01"));
		students.add(new Student2("Alec","A02"));
		System.out.println(students);
	}
}
class Student2
{
	private String name;
	private String number;
	Student2(String name,String number)
	{
		this.name=name;
		this.number=number;
	}
	
	@Override
	public int hashCode()
	{
//		int hash=7;
//		hash=47*hash+Objects.hashCode(this.name);
//		hash=47*hash+Objects.hashCode(this.number);
//		return hash;
		int hashCode=Objects.hash(this.name,this.number);
		System.out.printf("hashCode=%d %n",hashCode);
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("equal?1");
		if(obj==null)
			return false;
		System.out.println("equal?2");		
		if(getClass()!=obj.getClass())
			return false;
		System.out.println("equal?3");		
		final Student2 other=(Student2)obj;
		if(!Objects.equals(this.name, other.name))
			return false;
		System.out.println("equal?4");		
		if(!Objects.equals(this.number, other.number))
			return false;
		System.out.println("equal?5");		
		return true;
	}
	@Override
	public String toString()
	{
		return String.format("(%s,%s)", this.name,this.number);
	}
}
