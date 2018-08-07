package j2se8.ch12;

import java.util.Arrays;

public class LambdaDemo
{

	public static void main(String[] args)
	{
		String[] names={"A1","C111","B11","D1111"};
		Arrays.sort(names,(name1,name2)-> StringOrder.byLength(name1, name2));
		System.out.println(Arrays.toString(names));

	}

}
