package j2se8.ch18;

public class Node<T>
{
	public T value;
	public Node<T> next;
	public Node(T value,Node<T> next)
	{
		this.value=value;
		this.next=next;
	}
}
