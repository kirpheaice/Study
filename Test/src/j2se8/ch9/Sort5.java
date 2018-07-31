package j2se8.ch9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;

class StringCompare implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2)
	{
		return -o1.compareTo(o2);
	}
	
}

public class Sort5
{
	public static void main(String[] args)
	{
		List list=Arrays.asList("B","X","E","Z","A");
		Collections.sort(list,new StringCompare());
//		Collections.sort(list,(s1,s2) -> -s1.toString().compareTo(s2.toString()));
//		list.sort((s1,s2)-> -s1.toString().compareTo(s2.toString()));
//		list.sort(String::compareTo);
		System.out.println(list);
	}
}
