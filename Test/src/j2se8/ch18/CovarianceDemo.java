package j2se8.ch18;

public class CovarianceDemo
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
//		Node<Apple> apple=new Node<>(new Apple(),null);
//		Node<? extends Fruit> fruit=apple;
		Node<Apple> apple1=new Node<>(new Apple(),null);
		Node<Apple> apple2=new Node<>(new Apple(),apple1);
		Node<Apple> apple3=new Node<>(new Apple(),apple2);
		Node<Banana> bana1=new Node<>(new Banana(),null);
		Node<Banana> bana2=new Node<>(new Banana(),bana1);
		System.out.println("b4 show,apple3.value="+apple3.value);
		show(apple3);
		System.out.println("after show,apple3.value="+apple3.value);
		show(bana2);
	}

	public static void show(Node<? extends Fruit> n)
	{
//		Node<? extends Fruit> node=n;
		do
		{
			System.out.println(n.value);
			n=n.next;
		}while(n!=null);
	}
}
