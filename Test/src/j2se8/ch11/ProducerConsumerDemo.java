package j2se8.ch11;

public class ProducerConsumerDemo
{

	public static void main(String[] args)
	{
		Clerk clerk=new Clerk();
		new Thread(new Producer(clerk)).start();
		new Thread(new Consumer(clerk)).start();
	}

}