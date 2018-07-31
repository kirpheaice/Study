package j2se8.ch11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download
{

	public static void main(String[] args) throws Exception
	{
		URL[] urls=
			{
				new URL("http://openhome.cc/Gossip/Encoding/"),
				new URL("http://openhome.cc/Gossip/Scala/"),
				new URL("http://openhome.cc/Gossip/JavaScript/"),
				new URL("http://openhome.cc/Gossip/Python/")
			};
		String[] fileNames=
			{
					"Encoding.html",
					"Scala.html",
					"JavaScript.html",
					"Python.html"
			};
		for(int i=0;i<urls.length;i++)
		{
			dump(urls[i].openStream(),new FileOutputStream(fileNames[i]));
		}
	}
	
	static void dump(InputStream src,OutputStream dst) throws Exception
	{
		try(InputStream in=src;OutputStream out=dst)
		{
			byte[] data=new byte[1024];
			int len;
			while((len=in.read(data))!=-1)
				out.write(data, 0, len);
		}
	}

}
