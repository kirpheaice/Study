package j2se8.ch18;

class Animal{}
class Human extends Animal{}
class Toy{}
class Duck<T extends Animal>{}
public class BoundDemo
{

	public static void main(String[] args)
	{
		Duck<Animal> ad=new Duck<Animal>();
		Duck<Human> hm=new Duck<Human>();
//		Duck<Toy> ty=new Duck<Toy>();
	}

}
