package j2se8.ch10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedIO
{
	public static void dump(InputStream src,OutputStream dst) throws IOException
	{
		try(InputStream in=new BufferedInputStream(src);OutputStream out=new BufferedOutputStream(dst))
		{
			byte[] data=new byte[1024];
			int length;
			while((length=in.read(data))!=-1)
				out.write(data, 0, length);
		}
	}
}
