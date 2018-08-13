package j2se8.ch13;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MonthDemo
{

	public static void main(String[] args)
	{
//		for(Month m:Month.values())
//			System.out.printf("%d , %d, %s %n",m.getValue(),m.ordinal(),m);
		System.out.println(LocalDate.of(1975, 6, 1).plusDays(29).plusMonths(6).plusWeeks(1)
				.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		System.out.println(LocalDate.of(1974, 4, 1).plus(Period.ofDays(1)));
	}

}
