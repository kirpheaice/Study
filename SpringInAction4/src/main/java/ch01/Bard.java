package ch01;

import java.io.PrintStream;

public class Bard
{
	private PrintStream stream;
	
	public Bard(PrintStream stream)
	{
		this.stream=stream;
	}
	
	public void singBeforeQuest()
	{
		stream.println("Before the quest.....");
	}
	
	public void singAfterQuest()
	{
		stream.println("After the quest.....");
	}
}
