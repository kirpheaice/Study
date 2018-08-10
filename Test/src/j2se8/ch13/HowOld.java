package j2se8.ch13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowOld
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("BD(yyyy-mm-dd):");
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date bd=df.parse(new Scanner(System.in).nextLine());
		Date now=new Date();
		long ms=now.getTime() - bd.getTime();
		System.out.println("age="+ms/(365*24*60*60*1000L));
	}

}
