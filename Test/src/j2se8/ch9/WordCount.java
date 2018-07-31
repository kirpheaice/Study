package j2se8.ch9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class WordCount
{
	public static void main(String[] args)
	{
		Scanner console=new Scanner(System.in);
		Set words=tokenSet(console.nextLine());
		System.out.printf("不重複 words=%d : %s %n", words.size(),words);
	}
	
	static Set tokenSet(String line)
	{
		String[] tokens=line.split(" ");
		List<String> a=Arrays.asList(tokens);
		return new HashSet(Arrays.asList(tokens));
	}
}
