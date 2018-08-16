package j2se8.ch17;
import static java.lang.System.out;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassViewer
{

	public static void main(String[] args)
	{
		try
		{
			view("java.lang.String");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
	
	public static void view(String className) throws Exception
	{
		Class c=Class.forName(className);
		showPackageInfo(c);
		showClassInfo(c);
		out.println("{");
		showField(c);
		showConstructor(c);
		showMethod(c);
		out.println("}");
	}
	private static void showClassInfo(Class c)
	{
		int modifier=c.getModifiers();
		out.printf("%s %s %s %n",
				Modifier.toString(modifier),
				Modifier.isInterface(modifier)?"Interface":"Class",
				c.getName());
	}
	private static void showPackageInfo(Class c) 
	{
		Package p=c.getPackage();
		out.printf("Package:[%s]%n",p.getName());
	}
	
	private static void showField(Class c) throws SecurityException
	{
		Field[] field1=c.getDeclaredFields();
//		Field[] field2=c.getFields();
//		out.println("=========[Declared Field]============");
		for(Field field:field1)
			out.printf("\t%s %s %s %n"
					,Modifier.toString(field.getModifiers())
					,field.getType().getName(),field.getName());
//		out.println("=========[Field]============");
//		for(Field field:field2)
//			out.printf("\t%s %s %s %n",
//					Modifier.toString(field.getModifiers()),
//					field.getType().getName(),field.getName());
	}
	
	private static void showConstructor(Class c)throws SecurityException
	{
		Constructor[] constructor1=c.getDeclaredConstructors();
//		Constructor[] constructor2=c.getConstructors();
//		out.println("=========[Declared Constructors]============");
		for(Constructor constructor:constructor1)
			out.printf("\t%s %s %n",
					Modifier.toString(constructor.getModifiers()),
					constructor.getName());
//		out.println("=========[Constructors]============");
//		for(Constructor constructor:constructor2)
//			out.printf("\t%s %s %n",
//					Modifier.toString(constructor.getModifiers()),
//					constructor.getName());
	}
	
	private static void showMethod(Class c) throws Exception
	{
		Method[] m1=c.getDeclaredMethods();
//		Method[] m2=c.getMethods();
//		out.println("=========[Declared Method]============");
		for(Method m:m1)
			out.printf("\t%s %s %s %n",
					Modifier.toString(m.getModifiers()),
					m.getReturnType().getName(),m.getName());
//		out.println("=========[Method]============");
//		for(Method m:m2)
//			out.printf("\t%s %s %s %n",
//					Modifier.toString(m.getModifiers()),
//					m.getReturnType().getName(),m.getName());
	}
	
}
