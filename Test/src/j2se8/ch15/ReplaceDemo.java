package j2se8.ch15;

public class ReplaceDemo
{

	public static void main(String[] args)
	{
		String[] regexs={".*foo",".*?foo",".*+foo"};
		for(String token:regexs)
			System.out.println("xfooxxxxxxxxfoo".replaceAll(token, "囧"));
	}

}
