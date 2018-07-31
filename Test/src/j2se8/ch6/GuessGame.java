package j2se8.ch6;

public abstract class GuessGame
{
	public void go()
	{
		int number=(int)(Math.random()*10);
		println(String.valueOf(number));
		int guess;
		do
		{
			print("please input number");
			guess=nextInt();
		}while(guess!=number);
		println("bingo");
	}
	
	public void println(String text)
	{
		print(text + "\n");
	}
	
	public abstract void print(String text);
	public abstract int nextInt();
}
