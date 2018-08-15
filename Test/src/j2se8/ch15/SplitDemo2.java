package j2se8.ch15;

public class SplitDemo2
{
    public static void main(String[] args)
    {
    	for(String s:"a dog b doggie c".split("\\bdog\\b"))
    		System.out.printf("s=[%s]%n",s);
    }
}
