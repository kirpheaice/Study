package j2se8.ch11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo
{
	
	public static void main(String[] args)
	{
		ScheduledExecutorService service=Executors.newSingleThreadScheduledExecutor();
		System.out.println("0."+new java.util.Date());
//		service.scheduleAtFixedRate(()->
//		{
//			System.out.println("1."+new java.util.Date());
//			try
//			{
//				System.out.println("2."+new java.util.Date());
//				Thread.sleep(2000);
//			}
//			catch(Exception e)
//			{
//				throw new RuntimeException(e);
//			}
//		}, 2000, 1000, TimeUnit.MILLISECONDS);
		service.scheduleWithFixedDelay(()->
		{
			System.out.println("1."+new java.util.Date());
			try
			{
				System.out.println("2."+new java.util.Date());
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				throw new RuntimeException(e);
			}
		}, 2000, 1000, TimeUnit.MILLISECONDS);

	}

}
