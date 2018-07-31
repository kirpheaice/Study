package onlyfun.caterpillar;

import java.util.logging.Logger;

public class HelloProxy implements IHello
{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	private IHello helloObject;
	
	public HelloProxy(IHello hello)
	{
		this.helloObject=hello;
	}

	public void hello(String name)
	{
		log("hello method start");
		helloObject.hello("hello!"+name);
		log("hello method stop");
	}
	
	private void log(String msg)
	{
		logger.info(msg);
	}

}
