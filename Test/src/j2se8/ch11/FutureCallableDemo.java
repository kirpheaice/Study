package j2se8.ch11;

import java.util.concurrent.FutureTask;

public class FutureCallableDemo
{
	static long fibonacci(long n) throws Exception
	{
//		System.out.printf("n=%d %n",n);
//		Thread.sleep(5);
		if(n<=1)
			return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) throws Exception
	{
		FutureTask<Long> the30th=new FutureTask<>(()->fibonacci(30));
		System.out.println("b4 new Thread");
		new Thread(the30th).start();
		while(!the30th.isDone())
			System.out.println("doing something else");
		System.out.printf("the 30th=%d%n",the30th.get());
	}

}
