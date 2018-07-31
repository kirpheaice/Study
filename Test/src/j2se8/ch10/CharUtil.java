package j2se8.ch10;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharUtil
{
	public static void dump(Reader src,Writer dst) throws IOException
	{
		try(Reader r=src;Writer w=dst)
		{
			char[] data=new char[1024];
			int len;
			while((len=src.read(data))!=-1)
			{
				w.write(data, 0, len);
			}
		}
	}
}
