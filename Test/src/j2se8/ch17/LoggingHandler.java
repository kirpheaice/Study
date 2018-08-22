package j2se8.ch17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.*;

public class LoggingHandler implements InvocationHandler
{
	private Object target;
	
	public Object bind(Object target)
	{
		this.target=target;
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object result=null;
		try
		{
			log(String.format("(%s)call start", method.getName()));
			method.invoke(target, args);
			log(String.format("(%s)call stop", method.getName()));
		}
		catch(Exception e)
		{
			log(e.toString());
		}
		return result;
	}
	
	private void log(String msg)
	{
		Logger.getLogger(LoggingHandler.class.getName()).log(Level.INFO, msg);
	}
}
