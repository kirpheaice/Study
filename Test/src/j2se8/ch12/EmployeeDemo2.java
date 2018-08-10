package j2se8.ch12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeDemo2
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
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
//		numbers.stream().forEach(System.out::println);
		numbers.parallelStream().forEachOrdered(System.out::println);

		int sum=employees.stream()
				.filter(e->e.getGender().equals(Gender.Female))
				.mapToInt(Employee::getAge)
				.reduce((total,age)->total+age).getAsInt();
		
		long ttl=employees.stream()
				.filter(e->e.getGender().equals(Gender.Female)).count();
		
		long avg=employees.stream()
				.filter(e->e.getGender().equals(Gender.Male))
				.mapToInt(Employee::getAge)
				.reduce((a, b)->a+b).getAsInt()/ttl;
		
		int max=employees.stream()
				.filter(e->e.getAge()>30)
				.mapToInt(Employee::getAge)
				.reduce(0, (a,b)->a>b ? a : b);
		
		System.out.printf("sum=%d,total=%d,avg=%d,max=%d %n",sum,ttl,avg,max);
		
//		List<Employee> male=employees.stream()
//				.filter(e->e.getGender().equals(Gender.Male))
//				.collect(Collectors.toList());
//		male.stream().map(Employee::getName)
//			.forEach(System.out::println);
		
//		List<Employee> males=employees.stream()
//				.filter(a1->a1.getGender()==Gender.Male)
//				.collect(()->new ArrayList<>(),
//						(b1,b2)->b1.add(b2),
//						(c1,c2)->c1.addAll(c2));
//		males.stream().map(Employee::getName).forEach(System.out::println);
		
//		List<Employee> Males=employees.stream()
//				.filter(a->a.getGender()==Gender.Male)
//				.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
//		Males.stream().map(Employee::getName).forEach(System.out::println);
		
//		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender)).toString());
//		employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.toList()))
//		.forEach((a,b)->{
//			System.out.printf("[%s]%n",a.name());
//			for(int i=0;i<b.size();i++)
//				System.out.println(b.get(i).getName());
//		});
		
		Map<Gender,Double> male3=employees.stream().collect(
			Collectors.groupingBy(Employee::getGender,
				Collectors.averagingDouble(Employee::getAge)));
		System.out.println(male3.get(Gender.Male));
		System.out.println(male3.get(Gender.Female));
		

		Map<Gender,List<Employee>> male0=employees.stream().collect(Collectors.groupingBy(Employee::getGender));
		male0.get(Gender.Male).stream().map(e->e.getName()).collect(Collectors.toList()).forEach(System.out::println);
		//collect(collector)   forEach(System.out::println);
		
//		Map<Gender,List<String>> male1=employees.stream().collect(
//				Collectors.groupingBy(Employee::getGender,
//				Collectors.mapping(Employee::getName,Collectors.toList())));
//		male1.get(Gender.Male).forEach(System.out::println);
//		male1.get(Gender.Female).forEach(System.out::println);
		
		Map<Gender,Integer> male2=employees.stream().collect(
			Collectors.groupingBy(Employee::getGender,
				Collectors.reducing(0,Employee::getAge,Integer::sum)));
		System.out.println(male2.get(Gender.Male));
		System.out.println(male2.get(Gender.Female));
		
		
//		employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.reducing(0,Employee::getAge,Integer::sum)));
	}

}
