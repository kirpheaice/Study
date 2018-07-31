package designPattern.protoType;

public class Wheel implements Cloneable
{
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
