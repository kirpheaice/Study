package j2se8.ch14;

import java.io.FileOutputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOUtil
{

	public static void main(String[] args) throws Exception
	{
		Path p=Paths.get(System.getProperty("user.home"), "Documents","Project");
		System.out.println(p);
//		System.out.println(System.getProperty("user.home"));
		
		URL url=new URL("http://openhome.cc");
		ReadableByteChannel src=Channels.newChannel(url.openStream());
		WritableByteChannel dst=new FileOutputStream("index.html").getChannel();
		NIOUtil.dump(src, dst);
	}

	public static void dump(ReadableByteChannel src,WritableByteChannel dst) throws Exception
	{
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		try(ReadableByteChannel r=src;WritableByteChannel w=dst)
		{
			while(r.read(buffer)!=-1)
			{
				buffer.flip();
				w.write(buffer);
				buffer.clear();
			}
		}
	}
}
