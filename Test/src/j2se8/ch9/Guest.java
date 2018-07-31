package j2se8.ch9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest
{
	public static void main(String[] args)
	{
		List names=new ArrayList();
		collectNameToList(names);
		System.out.println("Print GuestName List");
		printUpperCase(names);
	}
	
	static void collectNameToList(List names)
	{
		Scanner console=new Scanner(System.in);
		while(true)
		{
			System.out.print("Name:");
			String name=console.nextLine();
			if(name.equals("quit"))
				break;
			names.add(name);
		}
	}
	
	static void printUpperCase(List names)
	{
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i).toString().toUpperCase());
	}
}
