package j2se8.ch17;

import java.util.logging.Logger;

public class HelloProxy implements Hello
{
	private Hello helloObj;
	
	public HelloProxy(Hello helloObj)
	{
		this.helloObj=helloObj;
	}
	public void hello(String name)
	{
		log("Start");
		helloObj.hello(name);
		log("Stop");
	}
	private void log(String msg)
	{
		Logger logger=Logger.getLogger(HelloProxy.class.getName());
		logger.log(java.util.logging.Level.INFO,msg);
	}
}
