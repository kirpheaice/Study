package j2se8.ch8;

public class AutoCloseableDemo2
{
	public static void main(String[] args)
	{
		try(Connection conn=new Connection();Cursor cur=new Cursor())
		{
			conn.open();
			cur.open();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Connection implements AutoCloseable
{
	public void open()
	{
		System.out.println("Conn Open");
	}
	@Override
	public void close() throws Exception
	{
		System.out.println("Conn Close");
	}
}

class Cursor implements AutoCloseable
{
	public void open()
	{
		System.out.println("Cursor Open");
	}

	@Override
	public void close() throws Exception
	{
		System.out.println("Cursor Close");
	}
}
