package j2se8.ch11;

import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ArrayList1139<E>
{
	private ReadWriteLock lock=new ReentrantReadWriteLock();
	private Object[] elems;
	private int next;
	
	ArrayList1139(int capacity)
	{
		elems=new Object[capacity];
	}
	
	ArrayList1139()
	{
		this(16);
	}
	public void add(E elem)
	{
		lock.writeLock().lock();
		try
		{
			if(next==elems.length)
				elems=Arrays.copyOf(elems, next*2);
			elems[next++]=elem;
		}
		finally
		{
			lock.writeLock().unlock();
		}
	}
	
	public E get(int index)
	{
		lock.readLock().lock();
		try
		{
			return (E)elems[index];
		}
		finally
		{
			lock.readLock().unlock();
		}
	}
	
	public int size()
	{
		lock.readLock().lock();
		try
		{
			return next;
		}
		finally
		{
			lock.readLock().unlock();
		}
	}
}
