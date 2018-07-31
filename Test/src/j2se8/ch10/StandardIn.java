package j2se8.ch10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StandardIn
{

	public static void main(String[] args) throws IOException
	{
		System.setIn(new FileInputStream("D:\\123.txt"));
		try(Scanner file=new Scanner(System.in))
		{
			while(file.hasNextLine())
				System.out.println(file.nextLine());
		}
	}

}
