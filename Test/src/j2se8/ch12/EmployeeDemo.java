package j2se8.ch12;

import java.util.Arrays;
import java.util.List;

enum Gender{Male,Female}

class Employee
{
	private String name;
	private int age;
	private Gender gender;
	
	Employee(String name,int age,Gender gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Gender getGender()
	{
		return gender;
	}
}

public class EmployeeDemo
{

	public static void main(String[] args)
	{
		List<Employee> employees=Arrays.asList
		(
			new Employee("Jack",20,Gender.Male),
			new Employee("Jaco",25,Gender.Male),
			new Employee("Jade",30,Gender.Female),
			new Employee("John",35,Gender.Male),
			new Employee("Jessie",40,Gender.Female)
		);
		
		int sum=employees.stream()
				.filter(e->e.getAge()>25)
				.mapToInt(Employee::getAge).sum();
		
		int avg=(int)employees.stream()
				.filter(e->e.getGender().equals(Gender.Female))
				.mapToInt(Employee::getAge)
				.average().getAsDouble();
		
		int max=employees.stream()
				.filter(e->e.getGender().equals(Gender.Female))
				.mapToInt(Employee::getAge)
				.max().getAsInt();
		
		System.out.println(employees.stream().filter(e->e.getAge()>20).mapToInt(Employee::getAge).sum());
		
		
		System.out.printf("sum=%d,avg=%d,max=%d %n",sum,avg,max);
		
		Arrays.asList(sum,avg,max).forEach(System.out::println);
	}

}
