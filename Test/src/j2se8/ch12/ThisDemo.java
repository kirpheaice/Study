package j2se8.ch12;


class Hello
{
	Runnable r1=new Runnable()
	{
		@Override
		public void run()
		{
			System.out.println(this);
		}
	};
	Runnable r2=new Runnable()
	{
		@Override
		public void run()
		{
			System.out.println(this);
		}
	};
	
	public String toString()
	{
		return "Hello world";
	}
}
public class ThisDemo
{
	
	public static void main(String[] args)
	{
		Hello h=new Hello();
		h.r1.run();
		h.r2.run();
	}

}
