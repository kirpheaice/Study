package j2se8.ch17;

public class ProxyDemo
{
	public static void main(String[] args)
	{
		LoggingHandler h=new LoggingHandler();
		Hello hello=(Hello)h.bind(new HelloSpeaker());
		hello.hello("John");
	}
}
