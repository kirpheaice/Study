package j2se8.ch11;

class Variable1
{
	static int i=0,j=0;
	static void one()
	{
		i++;
		j++;
	}
	static void two()
	{
		System.out.printf("i=%d,j=%d %n", i,j);
	}
}
public class Variable1Test
{

	public static void main(String[] args)
	{
		Thread t1=new Thread(()->{
			while(true)
//			for (int i=0;i<10000;i++)
			{
				Variable1.one();
			}
		});
		Thread t2=new Thread(()->{
			while(true)
//			for (int i=0;i<10000;i++)
			{
				Variable1.two();
			}
		});
		t1.start();
		t2.start();
	}

}
