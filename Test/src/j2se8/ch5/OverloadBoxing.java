package j2se8.ch5;

class Some
{
	void someMethod(int i)
	{
		System.out.println("int");
	}
	
	void someMethod(Integer i)
	{
		System.out.println("Integer");
	}
}

public class OverloadBoxing
{
	public static void main(String[] args)
	{
		Some s=new Some();
		s.someMethod((Integer)1);
	}
}
