package j2se8.ch11;

import java.util.concurrent.Executor;

public class DirectExecutor implements Executor
{
	@Override
	public void execute(Runnable command)
	{
		command.run();
	}
}
