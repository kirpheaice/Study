package j2se8.ch11;

public class ThreadGroupDemo2
{

	public static void main(String[] args)
	{
		ThreadGroup group=new ThreadGroup("group");
		
		Thread t1=new Thread(group,()->{
			throw new RuntimeException("thread 1 test");
		});
		
		t1.setUncaughtExceptionHandler((t3,throwable)->{
			System.out.printf("%s:%s %n", t3.getName(),throwable.getMessage());
		});
		
		Thread t2=new Thread(group,()->{
			throw new RuntimeException("thread 2 test");
		});
		t1.start();
		t2.start();
	}

}
