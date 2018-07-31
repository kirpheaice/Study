package j2se8.ch10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO
{
	public static void dump(InputStream src,OutputStream dst) throws IOException
	{
		try(InputStream input=src;OutputStream output=dst)
		{
			byte[] data=new byte[1024];
			int len;
			while((len=input.read(data))!=-1)
			{
				output.write(data,0,len);
			}
		}
		
	}
}
