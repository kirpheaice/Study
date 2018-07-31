package onlyfun.caterpillar;

public class ProxyDemoStatic
{
	public static void main(String[] args)
	{
		IHello proxy=new HelloProxy(new HelloSpeaker());
		proxy.hello("John");
	}
}
