package j2se8.ch13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalTime lt=LocalTime.of(0, 0,0);
		LocalDate ld=LocalDate.of(1975, 4, 1);
		ZonedDateTime zdt=ZonedDateTime.of(ld, lt,ZoneId.of("Asia/Taipei"));
		ZonedDateTime.of(LocalDateTime.of(1974, 4,1,0,0,0),ZoneId.of("Asia/Taipei"));
		
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(zdt.toEpochSecond());
		System.out.println(zdt.toInstant().toEpochMilli());
		
		LocalDate nowDate=LocalDate.now();
		LocalTime nowTime=LocalTime.now();
		OffsetDateTime offsetDatetime=OffsetDateTime.of(nowDate, nowTime,ZoneOffset.UTC);
		
//		nowDate.
		System.out.println(offsetDatetime);
//		System.out.println(nowDate.getDayOfMonth());
	}

}
