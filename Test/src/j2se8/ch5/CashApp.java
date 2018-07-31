package j2se8.ch5;

import java.util.Scanner;

public class CashApp
{
	public static void main(String[] args)
	{
		CashCard[] cashCards=
			{
					new CashCard("A001",500,0),
					new CashCard("A002",300,0),
					new CashCard("A003",1000,1),
					new CashCard("A004",2000,2),
					new CashCard("A005",3000,3)
			};
		
		Scanner console=new Scanner(System.in);
		
		for(CashCard cc:cashCards)
		{
			System.out.printf("%s,%d,%d wanna store :",cc.getNumber(),cc.getBalance(),cc.getBonus());
			cc.store(console.nextInt());
			System.out.printf("Detail:(%s,%d,%d)%n", cc.getNumber(),cc.getBalance(),cc.getBonus());
		}
	}
}
