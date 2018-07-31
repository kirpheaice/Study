package j2se8.ch9;

import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue3
{

	public static void main(String[] args)
	{
		Map map=new TreeMap();
		map.put("1","Allen");
		map.put("2","Bryan");
		map.put("3","Coven");
		map.forEach((key,value)->System.out.printf("KEY=%s,Value=%s %n",key,value));
	}

}
