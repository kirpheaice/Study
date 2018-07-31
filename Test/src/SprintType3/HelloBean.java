package SprintType3;

public class HelloBean
{
	private String name;
	private String helloWord;
	
	public HelloBean(){}
	public HelloBean(String name,String helloWord)
	{
		this.name=name;
		this.helloWord=helloWord;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getHelloWord()
	{
		return helloWord;
	}

	public void setHelloWord(String helloWord)
	{
		this.helloWord = helloWord;
	}
	
	
}
