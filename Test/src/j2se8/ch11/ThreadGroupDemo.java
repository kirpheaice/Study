package j2se8.ch11;

public class ThreadGroupDemo
{
	public static void main(String[] args)
	{
		ThreadGroup group=new ThreadGroup("TG1"){
			@Override
			public void uncaughtException(Thread thread,Throwable throwable)
			{
				System.out.printf("%s:%s %n",thread.getName(),throwable.getMessage());
			}
		};
		
		Thread t=new Thread(group,()->{
			throw new RuntimeException("test exception");
		});
		
		t.start();
//		Thread t=new Thread(tg1,"Thread1");
//		
//		Thread[] tg=new Thread[tg1.activeCount()];
//		tg1.enumerate(tg);
	}

}
