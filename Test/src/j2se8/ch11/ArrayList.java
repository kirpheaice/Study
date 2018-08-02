package j2se8.ch11;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayList<E>
{
	private Lock lock=new ReentrantLock();
	private Object[] elems;
	private int next;
	
	public ArrayList(int capacity)
	{
		elems=new Object[capacity];
	}
	
	public ArrayList()
	{
		this(16);
	}
	
	public void add(E elem)
	{
		lock.lock();
		try
		{
			if(next==elems.length)
				elems=Arrays.copyOf(elems, elems.length*2);
			elems[next++]=elem;
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public E get(int index)
	{
		lock.lock();
		try
		{
			return (E) elems[index];
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public int size()
	{
		lock.lock();
		try
		{
			return next;
		}
		finally
		{
			lock.unlock();
		}
	}
}
