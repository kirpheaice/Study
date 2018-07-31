package j2se8.ch6;

public class RPG2
{
	public static void main(String[] args)
	{
		SwordMan r1=new SwordMan();
		r1.setName("John");
		r1.setLevel(1);
		r1.setHp(30);

		Magician r2=new Magician();
		r2.setName("Jack");
		r2.setLevel(1);
		r2.setHp(30);
//		System.out.println(r2.name);
		drawFight(r1);
		drawFight(r2);

	}
	
	static void drawFight(Role r)
	{
		System.out.print(r.getName()+"-->");
		r.fight();
	}
}
