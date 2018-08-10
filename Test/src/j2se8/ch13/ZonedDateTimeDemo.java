package j2se8.ch13;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalTime lt=LocalTime.of(0, 0,0);
		LocalDate ld=LocalDate.of(1975, 4, 1);
		ZonedDateTime zdt=ZonedDateTime.of(ld, lt,ZoneId.of("Asia/Taipei"));
		
		System.out.println(zdt);
		System.out.println(zdt.toEpochSecond());
		System.out.println(zdt.toInstant().toEpochMilli());
	}

}
