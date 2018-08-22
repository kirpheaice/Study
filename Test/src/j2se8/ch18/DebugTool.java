package j2se8.ch18;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DebugTool
{
	public static void main(String[] args) throws Exception
	{
		Class<Other> c=Other.class;
		Method m=c.getMethod("doOther");
		if(m.isAnnotationPresent(Debug.class))
		{
			System.out.println("己設定@Debug標註");
			showDebugAnnotation(m);
		}
		else
			System.out.println("無設定@Debug標註");
			
		showAllAnnotation(m);
	}
	
	static void showDebugAnnotation(Method m)
	{
		Debug d=m.getAnnotation(Debug.class);
		System.out.printf("Name :[%s]%n",d.name());
		System.out.printf("Value:[%s]%n",d.value());
	}
	
	static void showAllAnnotation(Method m)
	{
		Annotation[] annotations=m.getAnnotations();
		for(Annotation a:annotations)
			System.out.println(a.annotationType().getName());
	}
}
