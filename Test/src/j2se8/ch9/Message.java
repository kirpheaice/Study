package j2se8.ch9;

import java.util.HashMap;
import java.util.Map;

public class Message
{

	public static void main(String[] args)
	{
		Map<String,String> m=new HashMap();
		m.put("1", "A");
		m.put("2", "B");
		m.put("3", "C");
		System.out.println(m.get("3"));
	}

}
