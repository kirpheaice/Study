package j2se8.ch11;

import java.util.concurrent.locks.ReentrantLock;

class Resource1137
{
	private ReentrantLock lock=new ReentrantLock();
	private String name;
	Resource1137(String name)
	{
		this.name=name;
	}
	
	void cooperate(Resource1137 res)
	{
		while(true)
		{
			try
			{
				if(lockMeAnd(res))
					System.out.printf("%s 整合 %s 的資源 %n",this.name,res.name);
				break;
			}
			finally
			{
				unlockMeAnd(res);
			}
		}
	}
	
	private boolean lockMeAnd(Resource1137 res)
	{
		return this.lock.tryLock() && res.lock.tryLock();
	}
	
	private void unlockMeAnd(Resource1137 res)
	{
		if(this.lock.isHeldByCurrentThread())
			this.lock.unlock();
		if(res.lock.isHeldByCurrentThread())
			res.lock.unlock();
	}
}

public class NoDeadLockDemo
{
	public static void main(String[] args)
	{
		Resource1137 r1=new Resource1137("R1");
		Resource1137 r2=new Resource1137("R2");
		
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				r1.cooperate(r2);
				
			}
		});

		Thread t2=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				r2.cooperate(r1);
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
