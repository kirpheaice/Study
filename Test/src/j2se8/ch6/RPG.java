package j2se8.ch6;

public class RPG
{
	public static void main(String[] args)
	{
		demoSwordMan();
		demoMagician();
	}
	
	static void demoSwordMan()
	{
		SwordMan sm=new SwordMan();
		Role role=new SwordMan();
		SwordMan sm2=(SwordMan)role;
		
		sm.setName("John");
		sm.setLevel(1);
		sm.setHp(200);
		System.out.printf("SwordMan:%s,%d,%d %n",sm.getName(),sm.getLevel(),sm.getHp());
	}
	static void demoMagician()
	{
		try
		{
			Role r=new Magician();
			Magician sm=(Magician)r;
			sm.setName("Jack");
			sm.setLevel(1);
			sm.setHp(50);
			System.out.printf("Magician:%s,%d,%d %n",sm.getName(),sm.getLevel(),sm.getHp());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
