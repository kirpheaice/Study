package j2se8.ch11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class FutureCallableDemo2
{
	static Logger logger=Logger.getLogger("FutureCallableDemo2");
	static long fibonacci(long n) throws Exception
	{
		if(n<=1)
			return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) throws Exception
	{
		ExecutorService service=Executors.newCachedThreadPool();
		
//		System.out.println("b4 new Thread");
		logger.info("b4 new thread");
		Future<Long> the30th=service.submit(()->fibonacci(30));
		while(!the30th.isDone())
			logger.warning("still waiting...");
		logger.info("30th="+the30th.get());
	
	}
}
