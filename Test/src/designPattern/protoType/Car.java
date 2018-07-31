package designPattern.protoType;

public class Car implements Cloneable
{
	private Wheel[] wheels={new Wheel(),new Wheel(),new Wheel(),new Wheel()};
	
	protected Object clone() throws CloneNotSupportedException
	{
		Car copy=(Car)super.clone();
		copy.wheels=(Wheel[])this.wheels.clone();
		for(int i=0;i<wheels.length;i++)
			copy.wheels[i]=(Wheel)this.wheels[i].clone();
		return copy;
	}
}
