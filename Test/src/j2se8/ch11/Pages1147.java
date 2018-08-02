package j2se8.ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.Executor;

public class Pages1147
{
	private URL[] urls;
	private String[] fileNames;
	private Executor executor;
	
	Pages1147(URL[] urls,String[] fileNames,Executor executor)
	{
		this.urls=urls;
		this.fileNames=fileNames;
		this.executor=executor;
	}
	
	public void download()
	{
		for(int i=0;i<urls.length;i++)
		{
			URL url=urls[i];
			String fileName=fileNames[i];
			executor.execute(()->{
				try
				{
					dump(url.openStream(),new FileOutputStream(fileName));
				}
				catch(Exception e)
				{
					throw new RuntimeException(e);
				}
			});
		}
	}
	
	private void dump(InputStream src,OutputStream dst) throws IOException
	{
		try(InputStream in=src;OutputStream out=dst)
		{
    		byte[] data=new byte[1024];
    		int len;
    		while((len=src.read(data))!=-1)
    		{
    			out.write(data, 0, len);
    		}
		}
	}
}
