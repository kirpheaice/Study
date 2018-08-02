package j2se8.ch11;

import java.util.Arrays;
import java.util.concurrent.locks.StampedLock;

public class ArrayList1141<E>
{
	private StampedLock lock=new StampedLock();
	private Object[] elems;
	private int next;
	
	ArrayList1141(int capacity)
	{
		elems=new Object[capacity];
	}
	ArrayList1141()
	{
		this(16);
	}
	
	public void add(E elem)
	{
		long stamped=lock.writeLock();
		try
		{
			if(next==elems.length)
				elems=Arrays.copyOf(elems, next);
			elems[next++]=elem;
		}
		finally
		{
			lock.unlockWrite(stamped);
		}
	}
	
	public E get(int index)
	{
		long stamped=lock.tryOptimisticRead();
		Object elem=elems[index];
		if(!lock.validate(stamped))
		{
			stamped=lock.readLock();
			try
			{
				elem=elems[index];
			}
			finally
			{
				lock.unlock(stamped);
			}
		}
		return (E)elem;
	}
	
	public int size()
	{
		long stamped=lock.tryOptimisticRead();
		int size=next;
		if(!lock.validate(stamped))
		{
			stamped=lock.readLock();
			try
			{
				size=next;
			}
			finally
			{
				lock.unlock(stamped);
			}
		}
		return size;
	}
}
