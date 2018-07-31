package j2se8.ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil2
{
	public static String readFile(String name) throws FileNotFoundException
	{
		StringBuilder sb=new StringBuilder();
		try(Scanner console=new Scanner(new FileInputStream(name)))
		{
			while(console.hasNext())
				sb.append(console.nextLine()).append("\n");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw e;
		}
		return sb.toString();
	}
}
