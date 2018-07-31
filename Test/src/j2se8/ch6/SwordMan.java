package j2se8.ch6;

public class SwordMan extends Role
{
	@Override
	public void fight()
	{
		System.out.println("phyical attack");
	}

	@Override
	public String toString()
	{
		return "SwordMan:"+super.toString();
	}

}
