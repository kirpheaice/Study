package j2se8.ch10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Download
{
	public static void main(String[] args) throws IOException
	{
		URL url=new URL("https://repo.spring.io/release/org/springframework/boot/");
		InputStream inputStream=url.openStream();
		OutputStream outputStream=new FileOutputStream("D:\\123.txt");
//		IO.dump(inputStream, outputStream);
		IO.dump(inputStream, System.out);
	}
}
