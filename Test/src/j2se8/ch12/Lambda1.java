package j2se8.ch12;

import java.util.Date;

interface B
{
	public void doStringWork(String s);
}
interface C
{
	public double doComputeWork(float x, float y);
}
public class Lambda1
{
	public Lambda1()
	{
		B b1=this::print1;
		b1=System.out::println;
		b1.doStringWork("Hello");
	}

	public static void main(String[] args)
	{
		B b=Lambda1::print2;
		b.doStringWork("Test 1");
		new Lambda1();
		C c=Math::pow;
		b.doStringWork(String.valueOf(c.doComputeWork(2.5f, 2)));
		System.out.println(new Date());
	}

	
	public static void print2(String s)
	{
		System.out.println("print2:"+s);
	}
	
	public void print1(String s)
	{
		System.out.println("print1:"+s);
	}
	
}
