package j2se8.ch9;

import java.util.*;
import static java.util.Comparator.*;

public class Sort6
{
	public static void main(String[] args)
	{
		List list=Arrays.asList("B","X","E",null,"Z","A");
		list.sort(nullsFirst(reverseOrder()));
		
	}

}
