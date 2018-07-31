package j2se8.ch11;

public class Some implements Runnable
{
	private boolean flag=true;
	
	public void stop()
	{
		this.flag=false;
	}

	@Override
	public void run()
	{
		while(flag)
		{
			System.out.println("exec...");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
