package j2se8.ch11;

public class Hare implements Runnable
{
	private boolean[] flags={true,false};
	private int totalStep;
	private int step;
	
	public Hare(int totalStep)
	{
		this.totalStep=totalStep;
	}
	
	@Override
	public void run()
	{
		while(step<totalStep)
		{
			boolean sleepFlag=flags[(int)(Math.random() *10)%2];
			if(sleepFlag)
				System.out.println("Hare zzzZZZ");
			else
			{
				step+=2;
				System.out.printf("Hare runs %d step%n",step);
			}
		}
	}

}
