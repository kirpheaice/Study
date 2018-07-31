package j2se8.ch9;

import java.util.HashSet;
import java.util.Set;

public class Students
{
	public static void main(String[] ages)
	{
		Set students=new HashSet();
		students.add(new Student("Alex","A01"));
		students.add(new Student("Alex","A01"));
		students.add(new Student("Allen","A02"));
		System.out.println(students);
	}
}

class Student
{
	private String name;
	private String number;
	Student(String name,String number)
	{
		this.name=name;
		this.number=number;
	}
	
	@Override
	public String toString()
	{
		return String.format("(%s,%s)", this.name,this.number);
	}
}
