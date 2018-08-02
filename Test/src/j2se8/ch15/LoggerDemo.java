package j2se8.ch15;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo
{
	public static void main(String[] args)
	{
		Logger logger=Logger.getLogger(LoggerDemo.class.getName());
		logger.log(Level.INFO, "INFO");
		logger.log(Level.WARNING, "WARNING");
		logger.log(Level.CONFIG, "Config??");
		logger.log(Level.FINE, "Fine ??");
		
		Logger global=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		for(Handler handler:logger.getParent().getHandlers())
		{
			System.out.println(handler);
			System.out.println(handler.getLevel());
		}
		
//		System.out.println(logger.getLevel());
//		System.out.println(logger.getHandlers().length);
//		System.out.println(logger.getParent().getLevel());
//		System.out.println(global.getLevel());
//		System.out.println(global.getParent().getLevel());
//		System.out.println(global.getHandlers().length);
	}
}
