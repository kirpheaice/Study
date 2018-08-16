package j2se8.ch17;

import static java.lang.System.out;

public class InfoAbout
{

	public static void main(String[] args) 
	{
		try
		{
    		Class clz=Class.forName("java.lang.String");
    		Package p=clz.getPackage();
    		out.println(p.getName());
    		out.println(clz.getName());
    		out.println(clz.isInterface());
    		out.println(clz.isPrimitive());
    		out.println(clz.isArray());
    		out.println(clz.getSuperclass().getName());
		}
		catch(Exception e)
		{
			out.print(e);
		}
	}

}
