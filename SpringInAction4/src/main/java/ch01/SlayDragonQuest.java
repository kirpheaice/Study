package ch01;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest
{
	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream s)
	{
		this.stream=s;
	}
	
	@Override
	public void embark()
	{
		stream.println("embarking on quest to slay the dragon!");
	}
}
