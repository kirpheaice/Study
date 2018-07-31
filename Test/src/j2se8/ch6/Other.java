package j2se8.ch6;

public class Other extends Some
{
	Other()
	{
		super(10);
		System.out.println("Other()");
	}
	
	public static void main(String[] args)
	{
		Other o=new Other();
	}
}
