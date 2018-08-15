package j2se8.ch15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo
{

	public static void main(String[] args)
	{
		f1();
	}
	static void f1()
	{
		Pattern pattern=Pattern.compile("(^[a-zA-Z]+\\d*)@([a-z]+?.)com");
		Matcher matcher=pattern.matcher("abcde@a.com");
//		Pattern p1=Pattern.compile("([a-z]+?.)com");
//		Matcher m1=p1.matcher("163.com");
//		System.out.println(m1.matches());
		System.out.println(matcher.replaceAll("$2X$1dd"));
	}

	static void f()
	{
		String[] regexs={".*foo",".*?foo",".*+foo"};
		for(String s:regexs)
		{
			Pattern pattern=Pattern.compile(s);
			Matcher matcher=pattern.matcher("xfooxxxxxxfoo");
			System.out.printf("[%-6s] find",pattern.pattern());
			while(matcher.find())
				System.out.printf(" \"%s\" ",matcher.group());
			System.out.println(" in \"xfooxxxxxxfoo\".");
		}
	}
}
