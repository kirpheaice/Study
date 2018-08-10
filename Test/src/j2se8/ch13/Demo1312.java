package j2se8.ch13;

import java.util.Calendar;

public class Demo1312
{

	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		c.set(2018, Calendar.AUGUST,10);
		c.add(Calendar.DATE, 3);
		boolean b=c.after(Calendar.getInstance());
		System.out.printf("%d %d %d",c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH));

	}

}
