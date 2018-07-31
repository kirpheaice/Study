package j2se8.ch11;

public class Consumer implements Runnable
{
	private Clerk clerk;
	
	public Consumer(Clerk clerk)
	{
		this.clerk=clerk;
	}
	
	@Override
	public void run()
	{
		System.out.println("Consumer start consume...");
		for(int i=1;i<=10;i++)
		{
			try
			{
				clerk.getProduct();
			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
			}
		}
	}

}
