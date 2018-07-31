package j2se8.ch6;

public abstract class Role
{
	protected String name;
	private int level;
	private int hp;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	
	public abstract void fight();
	
	public String toString()
	{
		return String.format("%s,%d,%d",name,level,hp);
	}
}
