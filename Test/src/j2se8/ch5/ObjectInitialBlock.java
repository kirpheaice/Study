package j2se8.ch5;

class Other
{
	Other()
	{
		System.out.println("constructor");
	}
	Other(int i)
	{
		System.out.println("int i");
	}
}

public class ObjectInitialBlock
{
	public static void main(String[] args)
	{
		new Other(1);
	}
}
