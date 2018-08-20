package j2se8.ch17;

public class ConsolePlayer implements Player
{
	@Override
	public void play(String video)
	{
		System.out.println("ConsolePlayer.play:"+video);
	}

}
