package j2se8.ch17;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

public class BeanUtil
{

	public static <T> T getBean(Map<String,Object> data,String className)
	throws Exception
	{
		Class c=Class.forName(className);
		Object bean=c.newInstance();
		
		data.entrySet().forEach(entry->{
			String key=entry.getKey();
			
			String setter=String.format("set%s%s",
					key.substring(0,1).toUpperCase(),
					key.substring(1).toLowerCase());
			try
			{
				Method method=c.getMethod(setter, entry.getValue().getClass());
				if(Modifier.isPublic(method.getModifiers()))
					method.invoke(bean, entry.getValue());
			}
			catch(Exception e)
			{
				e.printStackTrace();
//				throw new RuntimeException(e);
			}
		});
		return (T) bean;
	}
}
