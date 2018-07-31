package j2se8.ch9;

import java.io.IOException;
import java.util.Properties;

public class LoadSystemProps
{
	public static void main(String[] args) throws IOException
	{
		Properties p=System.getProperties();
		System.out.println(p.get("java.version"));
		System.out.println(p.get("java.home"));
		System.out.println(p.get("java.vendor"));
	}

}
