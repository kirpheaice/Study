package j2se8.ch12;

class Hello2
{
	Runnable r1=()->System.out.println(this);
	Runnable r2=()->System.out.println(toString());
	public String toString()
	{
		return "Hello World2";
	}
}
public class ThisDemo2
{

	public static void main(String[] args)
	{
		Hello2 hello2=new Hello2();
		hello2.r1.run();
		hello2.r2.run();
	}

}
