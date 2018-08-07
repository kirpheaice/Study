package j2se8.ch12;

public class StringOrder
{
	public static int byLength(String s1,String s2)
	{
		return s1.length()-s2.length();
	}
	
	public static int lyLexicography(String s1,String s2)
	{
		return s1.compareTo(s2);
	}
	
	public static int lyLexicographyIgnoreCase(String s1,String s2)
	{
		return s1.compareToIgnoreCase(s2);
	}
}