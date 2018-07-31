package j2se8.ch11;

class Variable2
{
	static int i=0,j=0;
	static synchronized void one()
	{
		i++;
		j++;
	}
	static synchronized void two()
	{
		System.out.printf("i=%d,j=%d %n", i,j);
	}
}

public class Variable2Test
{

	public static void main(String[] args)
	{
		Thread t1=new Thread(()->{
			while(true)
//			for (int i=0;i<10000;i++)
			{
				Variable2.one();
			}
		});
		Thread t2=new Thread(()->{
			while(true)
//			for (int i=0;i<10000;i++)
			{
				Variable2.two();
			}
		});
		t1.start();
		t2.start();
	}

}
