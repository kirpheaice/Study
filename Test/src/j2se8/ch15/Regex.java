package j2se8.ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{

	public static void main(String[] args)
	{
		Scanner console=new Scanner(System.in);
		try
		{
			System.out.println("輸入ex:");
			String regex=console.nextLine();
			System.out.println("輸入文字:");
			String text=console.nextLine();
			print(match(regex,text));
			String ac=String.join("a", "B");
			ac.concat("c");
			
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	static List<String> match(String regex,String text)
	{
		List<String> result=new ArrayList<>();
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(text);
		while(m.find())
			result.add(String.format("從索引 %d開始到%d ,找到符文文字 \"%s\" %n",m.start(),m.end(),m.group()));
		return result;
	}
	static void print(List<String> matched)
	{
		if(matched.isEmpty())
			System.out.println("no matched.");
		else
			matched.forEach(System.out::println);
	}
}
