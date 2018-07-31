package j2se8.ch5;

public class CallByValue
{
	public static void main(String[] args)
	{
		Customer c1=new Customer("Smith");
		some(c1);
		System.out.println(c1.name);

		Customer c2=new Customer("Smith");
		other(c2);
		System.out.println(c2.name);
	}
	
	static void some(Customer c)
	{
		c.name="John";
	}
	
	static void other(Customer c)
	{
		c=new Customer("Jack");
	}
}

class Customer
{
	String name;
	Customer(String name)
	{
		this.name=name;
	}
}