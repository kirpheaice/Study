package j2se8.ch10;

import java.io.FileReader;
import java.io.StringWriter;

public class CharUtilDemo
{

	public static void main(String[] args) throws Exception
	{
		FileReader reader=new FileReader("D:\\123.txt");
		StringWriter writer=new StringWriter();
		CharUtil.dump(reader, writer);
		System.out.println(writer.toString());
	}
}
