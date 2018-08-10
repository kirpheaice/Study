package j2se8.ch13;

import java.util.Calendar;

public class CalendarUtil
{

	public static void main(String[] args)
	{
		Calendar bd=Calendar.getInstance();
		bd.set(1974, Calendar.JULY,11);
		Calendar now=Calendar.getInstance();
		System.out.printf("Years=%d%n",yearsBetween(bd,now));
		System.out.printf("Days=%d%n",daysBetween(bd,now));
	}

	public static long yearsBetween(Calendar c1,Calendar c2)
	{
		Calendar calendar=(Calendar)c1.clone();
		long years=0;
		while(calendar.before(c2))
		{
			calendar.add(Calendar.YEAR, 1);
			years++;
		}
		return years;
	}
	
	public static long daysBetween(Calendar c1,Calendar c2)
	{
		long days=0;
		Calendar c=(Calendar)c1.clone();
		while(c.before(c2))
		{
			c.add(Calendar.DATE, 1);
			days++;
		}
		return days-1;
	}
}
