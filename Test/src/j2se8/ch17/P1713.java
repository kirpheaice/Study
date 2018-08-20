package j2se8.ch17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class P1713
{

	public static void main(String[] args) throws Exception
	{
		Class clz=Class.forName("j2se8.ch17.Student");
	
		Constructor cons=clz.getConstructor(String.class,Integer.class);
		Object obj=cons.newInstance("A",1);
		Method setter=clz.getMethod("setName", String.class);
		Method getter=clz.getMethod("getName");
		Field name=clz.getDeclaredField("name");
		name.setAccessible(true);
		System.out.println(name.get(obj));
		setter.invoke(obj, "B");
		System.out.println(getter.invoke(obj));
		System.out.println(clz.getMethod("getScore").invoke(obj));
//		Student stu=new Student("A",1);
//		System.out.println(stu.toString());
	}

	
	
}
