package designPattern.protoType;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		Car bmw=new Car();
		Car benz=new Car();
		Cars cars=new Cars();
		cars.addPrototype("bmw", bmw);
		cars.addPrototype("benz", benz);
		Car bmwPrototype=cars.getPrototype("bmw");
	}
}
