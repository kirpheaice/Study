package j2se8.ch13;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HowOld2
{

	public static void main(String[] args)
	{
		LocalDate ld1=LocalDate.of(1988, 8, 8);
		LocalDate ld2=LocalDate.now();
		MinguoDate md=MinguoDate.from(ld2);
		ThaiBuddhistDate td=ThaiBuddhistDate.from(ld2);
		//f();
		System.out.printf("%s %n",md);
		System.out.printf("%s %n",td);
		System.out.printf("%d %n",ChronoUnit.YEARS.between(ld1, ld2));
		System.out.printf("%d %n",ChronoUnit.MONTHS.between(ld1, ld2));
	}

	public static void f()
	{
		System.out.print("Key In (yyyy-mm-dd:) ");
		LocalDate bd=LocalDate.parse(new Scanner(System.in).nextLine());
		LocalDate now=LocalDate.now();
		Period p=Period.between(bd, now);
		System.out.printf("%d,%d,%d,%n",p.getYears(),p.getMonths(),p.getDays());
		System.out.printf("%s",LocalDate.of(1975, 4, 1).plus(1,ChronoUnit.DAYS));
	}
}
