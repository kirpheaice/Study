package j2se8.ch18;

public class SecurityTool
{

	public static void main(String[] args)
	{
		Filter[] filters=SecurityFilter.class.getAnnotationsByType(Filter.class);
		for(Filter f:filters)
			System.out.println(f.value());
	}

}
