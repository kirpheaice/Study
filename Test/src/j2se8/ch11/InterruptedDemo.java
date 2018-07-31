package j2se8.ch11;

public class InterruptedDemo
{
	public static void main(String[] args) 
	{
		Thread t=new Thread(()->{
			try
			{
				System.out.println("Thread Start...");
				Thread.sleep(99999);
				System.out.println("Thread Stop...");
			}
			catch(InterruptedException e1)
			{
				System.out.println("@@!!");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		});
		t.start();
		t.interrupt();
	}
}
