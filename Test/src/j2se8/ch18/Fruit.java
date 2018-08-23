package j2se8.ch18;

public class Fruit
{
	int price;
	int weight;
	public Fruit(){}
	public Fruit(int price,int weight)
	{
		this.price=price;
		this.weight=weight;
	}
}

class Apple extends Fruit
{
	public Apple(){}
	public Apple(int price,int weight)
	{
		super(price,weight);
	}
	
	@Override
	public String toString()
	{
		return "Apple";
	}
}
class Banana extends Fruit
{
	public Banana(){}
	public Banana(int price,int weight)
	{
		super(price,weight);
	}
	
	@Override
	public String toString()
	{
		return "Banana";
	}
}