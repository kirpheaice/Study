package j2se8.ch12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Customer
{
	private String firstName;
	private String lastName;
	private int zipCode;
	
	public Customer(String firstName,String lastName,int zipCode)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.zipCode=zipCode;
	}
	
	public String toString()
	{
		return String.format("Customer(%s,%s,%d)", firstName,lastName,zipCode);
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
}

public class CustomerDemo
{
	public static void main(String[] args)
	{
		List<Customer> customers=Arrays.asList(
			new Customer("George","Paul",8),
			new Customer("Allen","Iverson",3),
			new Customer("Chris","Paul",3));
		Comparator<Customer> byLastName=Comparator.comparing(Customer::getLastName);
//		customers.sort(byLastName);
		customers.sort(byLastName.
				thenComparing(Customer::getFirstName).
				thenComparing(Customer::getZipCode));
		
		customers.forEach(System.out::println);
	}

}
