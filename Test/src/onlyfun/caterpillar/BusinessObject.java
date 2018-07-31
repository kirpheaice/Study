package onlyfun.caterpillar;

public class BusinessObject
{
	private IDeviceWriter writer;
	
	/**
	 * Type3 IoC
	 * @param writer
	 */
	public BusinessObject(IDeviceWriter writer)
	{
		this.writer=writer;
	}
	
	/**
	 * Type2 IoC
	 * @param writer
	 */
	public void setDeviceWriter(IDeviceWriter writer)
	{
		this.writer=writer;
	}
	
	public void save()
	{
		writer.saveToDevice();
	}
}
