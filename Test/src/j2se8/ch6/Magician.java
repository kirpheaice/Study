package j2se8.ch6;

public class Magician extends Role
{
	@Override
	public void fight()
	{
		System.out.println("magic attack");
	}
	public void cure()
	{
		System.out.println("magic cure");
	}
	
	@Override
	public String toString()
	{
		return "Magician:"+super.toString();
	}
}
