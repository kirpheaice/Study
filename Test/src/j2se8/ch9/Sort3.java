package j2se8.ch9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Account2 implements Comparable<Account2>
{
	private String name;
	private String number;
	private int balance;
	
	Account2(String name , String number, int balance)
	{
		this.name=name;
		this.number=number;
		this.balance=balance;
	}
	
	@Override
	public String toString()
	{
		return String.format("Account(%s,%s,%d)", name,number,balance);
	}

	@Override
	public int compareTo(Account2 o)
	{
		return this.balance - o.balance;
	}
	
}
public class Sort3
{

	public static void main(String[] args)
	{
		List accounts=Arrays.asList(
				new Account2("A","01",1),
				new Account2("A","01",3),
				new Account2("A","01",9),
				new Account2("A","01",4));
		Collections.sort(accounts);
		System.out.println(accounts);
	}

}
