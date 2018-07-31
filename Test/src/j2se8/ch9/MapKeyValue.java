package j2se8.ch9;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValue
{
	public static void main(String[] args)
	{
		Map<String,String> map=new HashMap<>();
		map.put("1","Allen");
		map.put("2","Bryan");
		map.put("3","Coven");
		map.keySet().forEach(name->System.out.println(name));
		map.values().forEach(name->System.out.println(name));
	}
}
