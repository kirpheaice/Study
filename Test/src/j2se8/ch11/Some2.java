package j2se8.ch11;

public class Some2 implements Runnable
{
	private volatile boolean alive=true;
	
	public void stop()
	{
		this.alive=false;
	}
	@Override
	public void run()
	{
		while(alive)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("...");
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
