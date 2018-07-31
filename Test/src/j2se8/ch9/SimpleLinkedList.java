package j2se8.ch9;

public class SimpleLinkedList
{
	private class Node
	{
		Object o;
		Node next;
		Node(Object o)
		{
			this.o=o;
		}
	}
	
	private Node first;
	
	public void add(Object elem)
	{
		Node node=new Node(elem);
		if(first==null)
			first=node;
		else
			append(node);
	}
	
	private void append(Node node)
	{
		Node last=first;
		while(last.next!=null)
			last=last.next;
		last.next=node;
	}
	
	public int size()
	{
		int count=0;
		Node last=first;
		while(last!=null)
		{
			count++;
			last=last.next;
		}
		return count;
	}
	
	public Object get(int index)
	{
		checkSize(index);
		return findElemOf(index);
	}
	
	private void checkSize(int index) throws IndexOutOfBoundsException
	{
		int size=size();
		if(index>=size)
			throw new IndexOutOfBoundsException("Index Out Of Bounds~");
	}
	
	private Object findElemOf(int index)
	{
		int count=0;
		Node last=first;
		while(count<index)
		{
			last=last.next;
			count++;
		}
		return last.o;
	}
}
