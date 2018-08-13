package j2se8.ch14;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.text.DecimalFormat;

public class Disk
{

	public static void main(String[] args) throws Exception
	{
		FileSystem fileSystem=FileSystems.getDefault();
		for(FileStore fs:fileSystem.getFileStores())
		{
			print(fs);
		}
	}
	static void print(FileStore fs) throws Exception
	{
		long total=fs.getTotalSpace();
		long used=fs.getTotalSpace()-fs.getUnallocatedSpace();
		long usable=fs.getUsableSpace();
		DecimalFormat formatter=new DecimalFormat("#,###,###");
		System.out.println(fs.toString());
		System.out.printf("Total  : %s %n",formatter.format(total));
		System.out.printf("Used   : %s %n",formatter.format(used));
		System.out.printf("Usable : %s %n",formatter.format(usable));
	}
}
