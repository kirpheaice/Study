package j2se8.ch9;

import java.util.Map;
import java.util.TreeMap;

public class Message3
{
	public static void main(String[] args)
	{
		Map<String,String> m=new TreeMap<>((s1,s2)->s1.compareTo(s2));
		m.put("3", "A");
		m.put("6", "B");
		m.put("5", "C");
		System.out.println(m);

	}

}
