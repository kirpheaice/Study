package j2se8.ch9;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack
{
	private Deque elems=new ArrayDeque();
	private int capacity;
	
	public Stack(int capacity)
	{
		this.capacity=capacity;
	}
	
	public boolean isFull()
	{
		return elems.size()>=capacity;
	}
	
	public boolean push(Object elem)
	{
		if(isFull())
			return false;
		return elems.offerLast(elem);
	}
	
	public Object pop()
	{
		return elems.pollLast();
	}
	public Object peek()
	{
		return elems.peekLast();
	}
	public int size()
	{
		return elems.size();
	}
	public static void main(String[] args)
	{
		Stack stack=new Stack(5);
		stack.push("ALEX");
		stack.push("ALEC");
		stack.push("ALAN");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
