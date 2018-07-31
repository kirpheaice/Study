package j2se8.ch9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Account
{
	private String name;
	private String number;
	private int balance;
	
	Account(String name , String number, int balance)
	{
		this.name=name;
		this.number=number;
		this.balance=balance;
	}
	
	@Override
	public String toString()
	{
		return String.format("Account(%s,%s,%d", name,number,balance);
	}
	
}

public class Sort2
{
	
	public static void main(String[] args)
	{
		List accounts=Arrays.asList(
			new Account("A","01",1),
			new Account("A","01",2),
			new Account("A","01",3));
		Collections.sort(accounts);
		System.out.println(accounts);
	}
}
