package j2se8.ch15;

import java.time.Instant;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class FormatterDemo
{

	public static void main(String[] args)
	{
		Logger logger=Logger.getLogger(FormatterDemo.class.getName());
		logger.setLevel(Level.CONFIG);
		
		ConsoleHandler handler=new ConsoleHandler();
		handler.setLevel(Level.CONFIG);
		
		handler.setFormatter(new Formatter(){
			@Override
			public String format(LogRecord record)
			{
				return String.format("%s,[%s.%s](%s):%s%n", 
						Instant.ofEpochMilli(record.getMillis()),
						record.getSourceClassName(),
						record.getSourceMethodName(),
						record.getLevel(),
						record.getMessage());
			}
		});
		logger.addHandler(handler);
		logger.config("1234");
		logger.config("2234");
		logger.config("3234");
		
		
	}

}
