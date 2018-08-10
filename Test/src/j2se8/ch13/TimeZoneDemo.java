package j2se8.ch13;

import java.util.TimeZone;

public class TimeZoneDemo
{

	public static void main(String[] args)
	{
		TimeZone tz=TimeZone.getDefault();
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
		System.out.println(tz.getDSTSavings());
		System.out.println(tz.getRawOffset());
	}

}
