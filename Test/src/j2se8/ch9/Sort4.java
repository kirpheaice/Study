package j2se8.ch9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort4
{

	public static void main(String[] args)
	{
		List words=Arrays.asList("B","X","A","Z","D");
		Collections.sort(words);
		System.out.println(words);
	}

}
