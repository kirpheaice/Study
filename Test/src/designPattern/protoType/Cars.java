package designPattern.protoType;

import java.util.HashMap;
import java.util.Map;

public class Cars
{
	private Map<String,Car> prototypes=new HashMap<String,Car>();
	void addPrototype(String brand,Car prototype)
	{
		prototypes.put(brand, prototype);
	}
	Car getPrototype(String brand) throws CloneNotSupportedException
	{
		return (Car)prototypes.get(brand).clone();
	}
}
