package j2se8.ch5;

public class MathTool
{
	public static int sum(int... numbers)
	{
		int sum=0;
		for(int num:numbers)
			sum+=num;
		return sum;
	}

}
