package j2se8.ch11;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

class Fibonacci extends RecursiveTask<Long>
{
	final long n;
	
	Fibonacci(long n)
	{
		this.n=n;
	}
	
	@Override
	public Long compute()
	{
		if(n<20)
			return solveFibonacciSequentially(n);
		ForkJoinTask<Long> subTask=new Fibonacci(n-1).fork();
		return new Fibonacci(n-2).compute() + subTask.join();
	}
	
	static long solveFibonacciSequentially(long n)
	{
		if(n<=1)
			return n;
		return solveFibonacciSequentially(n-1)+
				solveFibonacciSequentially(n-2);
	}
	
}

public class FibonacciForkJoin
{

	public static void main(String[] args)
	{
		Fibonacci f=new Fibonacci(25);
		ForkJoinPool pool=new ForkJoinPool();
		System.out.println(pool.invoke(f));
	}

}
