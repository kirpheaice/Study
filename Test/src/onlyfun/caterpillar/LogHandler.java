package onlyfun.caterpillar;

import java.lang.reflect.*;
import java.util.logging.*;

public class LogHandler implements InvocationHandler
{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	private Object delegate;
	
	public Object bind(Object obj)
	{
		this.delegate=obj;
		return Proxy.newProxyInstance(
				obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(), this);
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object result=null;
		try
		{
			log("method start: "+method);
			result=method.invoke(delegate, args);
			logger.log(Level.INFO,"method end:"+method);
			
		}
		catch(Exception e)
		{
			log(e.toString());
		}
		return result;
	}

	private void log(String msg)
	{
		logger.log(Level.INFO,msg);
	}
}
