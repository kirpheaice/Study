package j2se8.ch9;

import java.util.Arrays;

public class ArrayList<E>
{
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
	
	public void add(E e)
	{
		if(next==elems.length)
			elems=Arrays.copyOf(elems, elems.length*2);
		elems[next++]=e;
	}
	public E get(int index)
	{
		return (E)elems[index];
	}
	
	public int size()
	{
		return next;
	}
	
	public static Object elemOf(Object[] objs,int index)
	{
		return objs[index];
	}
	
	public static <T> T elemOf2(T[] objs,int index)
	{
		return objs[index];
	}
}
