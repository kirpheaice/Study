package j2se8.ch17;

import java.util.Scanner;

public class MediaMaster
{

	public static void main(String[] args) throws 
		InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		String playerImpl="j2se8.ch17.ConsolePlayer";
		Player player=(Player)Class.forName(playerImpl).newInstance();
		System.out.println("please....:");
		player.play(new Scanner(System.in).nextLine());
	}

}
