package j2se8.ch17;

public class HelloSpeakerProxyDemo
{

	public static void main(String[] args)
	{
		HelloProxy proxy=new HelloProxy(new HelloSpeaker());
		proxy.hello("John");
	}

}
