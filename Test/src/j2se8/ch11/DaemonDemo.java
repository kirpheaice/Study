package j2se8.ch11;

public class DaemonDemo
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Start...");
		System.out.println(Thread.currentThread().isDaemon());

		Thread thread1=new Thread(()->{
			int i=0;
			System.out.printf("Thread 1 is Daemon ? %b%n",Thread.currentThread().isDaemon());
			while(true)
			{
				i++;
				try
				{
					Thread.sleep((int)(Math.random()*100));
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.printf("Thread1:%d%n", i);
			}
		});
		thread1.setDaemon(true);
		
		Thread thread2=new Thread(()->{
			int i=0;
			System.out.printf("Thread 2 is Daemon ? %b%n",Thread.currentThread().isDaemon());
			while(i<10)
			{
				i++;
				try
				{
					Thread.sleep((int)(Math.random()*1000));
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				System.out.printf("Thread2:%d%n", i);
			}
		});
		
		thread1.start();
		thread2.start();
		System.out.println("Stop...");
	}
}
