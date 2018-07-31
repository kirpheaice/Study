package j2se8.ch11;

class Resource
{
	private String name;
	private int resource;
	
	Resource (String name, int resource)
	{
		this.name=name;
		this.resource=resource;
	}
	String getName()
	{
		return name;
	}
	
	synchronized int doSome()
	{
		return ++resource;
	}
	
	synchronized void cooperate(Resource resource)
	{
		resource.doSome();
		System.out.printf("%s integrate resource from %s %n",this.name,resource.getName());
	}
}

public class DeadLockDemo
{
	public static void main(String[] args)
	{
		Resource r1=new Resource("R1",10);
		Resource r2=new Resource("R2",20);
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++)
				r1.cooperate(r2);
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<10;i++)
				r2.cooperate(r1);
		});
		t1.start();
		t2.start();
	}
}
