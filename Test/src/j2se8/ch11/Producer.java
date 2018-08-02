package j2se8.ch11;

public class Producer implements Runnable
{
	private Clerk clerk;
	
	public Producer(Clerk clerk)
	{
		this.clerk=clerk;
	}
	
	@Override
	public void run()
	{
		System.out.println("Produce Start...");
		for(int i=1;i<=10;i++)
		{
			try
			{
				System.out.println("Thread[P],b4 Sleep(10000)");
				Thread.sleep(10000);
				clerk.setProduct(i);
			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
			}
		}
	}

}
