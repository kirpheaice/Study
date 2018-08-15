package j2se8.ch15;

import java.util.Arrays;
import java.util.Random;

public class Ch1520
{

	public static void main(String[] args)
	{
		Random r=new Random();
//		r.ints(0,10).forEach(System.out::println);
		for(int i=0;i<10;i++)
			System.out.println(r.nextInt(100));

//		int[] arrs=new int[10];
//		Arrays.parallelSetAll(arrs, i->i);
//		for(int i:arrs)
//			System.out.println(i);

		for(String token:"a1bb2ccc3ddd".split("[123]"))
			System.out.println(token);
	}

}
