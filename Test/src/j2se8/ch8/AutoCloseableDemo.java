package j2se8.ch8;

public class AutoCloseableDemo
{
	public static void main(String[] args)
	{
		try(Resource r=new Resource())
		{
			r.doSome();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Resource implements AutoCloseable
{
	void doSome()
	{
		System.out.println("doSome");
	}
	
	@Override
	public void close() throws Exception
	{
		System.out.println("Resource Colse Here.");
	}
}