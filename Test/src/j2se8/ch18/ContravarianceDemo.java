package j2se8.ch18;

import java.util.Comparator;

public class ContravarianceDemo
{

	public static void main(String[] args)
	{
		Comparator<Fruit> priceComparator=(f1,f2)->f1.price-f2.price;
		Basket<Apple> apples=new Basket<>(new Apple(25,150),new Apple(20,100));
		Basket<Banana> bananas=new Basket<>(new Banana(50,305),new Banana(30,200));
		apples.sort(priceComparator);
		for(Apple a:apples.things)
			System.out.printf("Apple price:%d,weight:%d %n",a.price,a.weight);
		bananas.sort(priceComparator);
		for(Banana b:bananas.things)
			System.out.printf("Banana price:%d,weight:%d %n",b.price,b.weight);
	}
}
