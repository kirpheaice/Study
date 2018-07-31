package j2se8.ch9;

import java.util.Map;
import java.util.TreeMap;

public class Message2
{
	public static void main(String[] args)
	{
		Map<String,String> m=new TreeMap();
		m.put("3", "A");
		m.put("2", "B");
		m.put("5", "C");
		System.out.println(m);

	}
}
