package j2se8.ch15;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandlerDemo
{
	public static void main(String[] args) throws IOException
	{
		Logger logger=Logger.getLogger(HandlerDemo.class.getName());
		logger.setLevel(Level.CONFIG);
		FileHandler handler=new FileHandler("%h/config.log");
		handler.setLevel(Level.CONFIG);
		logger.addHandler(handler);
		logger.config("12345");
		
	}
}
