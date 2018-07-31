package j2se8.ch9;

import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue2
{

	public static void main(String[] args)
	{
		Map<String,String> map=new TreeMap<>();
		map.put("1","Allen");
		map.put("2","Bryan");
		map.put("3","Coven");
		foreach(map.entrySet());
	}

	static void foreach(Iterable<Map.Entry<String,String>> iterator)
	{
		for(Map.Entry<String,String> m:iterator)
			System.out.printf("KEY=%s,Value=%s %n",m.getKey(),m.getValue());
	}
}
