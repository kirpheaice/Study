package j2se8.ch9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties
{

	public static void main(String[] args) throws IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("/Users/jimlu/Documents/workspace/Test/person.properties"));
		System.out.println(p.get("username"));
		System.out.println(p.get("password"));
	}

}
