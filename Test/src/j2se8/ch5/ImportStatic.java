package j2se8.ch5;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class ImportStatic
{
	public static void main(String[] args)
	{
		Scanner console=new Scanner(in);
		out.println("please input:");
		out.printf("Hello %s!!%n",console.nextLine());
	}
}
