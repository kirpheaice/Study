package j2se8.ch11;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class Clerk
{
	Logger logger=Logger.getLogger(this.getClass().getName());
	private int product=-1;
	ConsoleHandler handler=new ConsoleHandler();
	
	public synchronized void setProduct(int product) throws InterruptedException
	{
		logger.info("Clerk.setProduct(),start("+product+")");
		waitIfFull();
		this.product=product;
		logger.info("Producer Setting("+this.product+")");
		logger.info("Clerk.setProduct(),b4 notify() ");
		notify();
		logger.info("Clerk.setProduct(),after notify()");
	}
	
	private synchronized void waitIfFull() throws InterruptedException
	{
		System.out.println("Clerk.waitIfFull(),start");
		while(this.product!=-1)
		{
			logger.info("prod!=-1,full,wait...");
			wait();
		}
		System.out.println("Clerk.waitIfFull(),finish");
	}
	
	public synchronized int getProduct() throws InterruptedException
	{
		System.out.printf("Clerk.getProduct(),start,%d%n",product);
		waitIfEmpty();
		int p=this.product;
		this.product=-1;
		System.out.printf("Consumer take (%d)%n",p);
		System.out.println("Clerk.getProduct(),b4 notify()");
		notify();
		System.out.println("Clerk.getProduct(),after notify()");
		return p;
	}
	
	private synchronized void waitIfEmpty() throws InterruptedException
	{
		while(this.product==-1)
		{
			logger.info("prod=-1,empty,wait...");
			wait();
		}
	}
}
