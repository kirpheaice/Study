package j2se8.ch15;

public class SplitDemo3
{
    public static void main(String[] args)
    {
    	for(String s:"a dog b doggie c".split("dog"))
    		System.out.printf("s=[%s]%n",s);
    }
}
