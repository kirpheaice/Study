package j2se8.ch5;

public class CashCard
{
	private String number;
	private int balance;
	private int bonus;
	
	CashCard(String number,int balance,int bonus)
	{
		this.number=number;
		this.balance=balance;
		this.bonus=bonus;
	}
	
	public String getNumber()
	{
		return number;
	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public int getBonus()
	{
		return bonus;
	}

	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	
	void store(int money)
	{
		if(money>0)
		{
			this.balance+=money;
			if(money>=1000)
				this.bonus++;
		}
		else
			System.out.println("store minus ?");
	}
	
	void charge(int money)
	{
		if(money>0)
			this.balance-=money;
		else
			System.out.println("charge minus ?");
	}
	
	int exchange(int bonus)
	{
		if(bonus>0)
			this.bonus-=bonus;
		return this.bonus;
	}
}
