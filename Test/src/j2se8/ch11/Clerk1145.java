package j2se8.ch11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Clerk1145
{
	private int product=-1;
	private Lock lock=new ReentrantLock();
	Condition ProductCond=lock.newCondition();
	Condition ConsumeCond=lock.newCondition();
	
	public void setProduct(int product) throws InterruptedException
	{
		lock.lock();
		try
		{
			WaitIfFull();
			this.product=product;
			System.out.printf("生產產品(%d) %n", product);
			ConsumeCond.signal();
		}
		finally
		{
			lock.unlock();
		}
	}
	
	private void WaitIfFull() throws InterruptedException
	{
		while(this.product!=-1)
			ProductCond.await();
	}
	
	public int getProduct() throws InterruptedException
	{
		lock.lock();
		try
		{
			WaitIfEmpty();
			int p=this.product;
			this.product=-1;
			System.out.printf("消費者拿到 (%) %n",p);
			ProductCond.signal();
			return p;
		}
		finally
		{
			lock.unlock();
		}
	}
	
	private void WaitIfEmpty() throws InterruptedException
	{
		while(this.product==-1)
			ConsumeCond.await();
	}
}
