package j2se8.ch11;

public class JoinDemo
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Main Thread Start.");
		Thread t=new Thread(()->{
			try
			{
				System.out.println("Sub Thread Start.");
				for(int i=0;i<10;i++)
				{
					System.out.printf("Sub Thread %d %n",i);
					Thread.sleep(500);
				}
				System.out.println("Sub Thread Stop.");
			}
			catch(Exception e)
			{
				
			}
		});
		t.start();
//		t.join();
		System.out.println("Main Thread Stop.");
	}

}
