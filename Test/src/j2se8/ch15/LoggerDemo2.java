package j2se8.ch15;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo2
{

	public static void main(String[] args)
	{
		Logger logger=Logger.getLogger(LoggerDemo2.class.getName());
		logger.setLevel(Level.FINEST);
		for(Handler handler:logger.getParent().getHandlers())
			handler.setLevel(Level.FINEST);
		logger.log(Level.INFO, "INFO");
		logger.log(Level.WARNING, "WARNING");
		logger.log(Level.CONFIG, "Config??");
		logger.log(Level.FINE, "Fine ??");
		logger.log(Level.FINER, "Finer ??");
		logger.log(Level.FINEST, "Finest ??");
		logger.fine(()->expansiveLogging());

	}
	public static String expansiveLogging()
	{
//		System.out.println("123");
		return "123";
	}
}
