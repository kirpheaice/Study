package j2se8.ch13;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo2
{

	public static void main(String[] args)
	{
		TimeZone tz=TimeZone.getTimeZone("Asia/Colombo");
		Calendar c=Calendar.getInstance(tz);
		showTime(c);
	}

	public static void showTime(Calendar c)
	{
		System.out.println(c.getTimeZone().getDisplayName());
		System.out.printf("%d %d:%d%n",c.get(Calendar.AM_PM),c.get(Calendar.HOUR),c.get(Calendar.MINUTE));
	}
}
