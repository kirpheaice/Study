package j2se8.ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy
{

	public static void main(String[] args) throws IOException
	{
		IO.dump(new FileInputStream("/Users/jimlu/Documents/workspace/Test/person.properties"), 
				new FileOutputStream("/Users/jimlu/Documents/workspace/Test/person2.properties"));
	}

}
