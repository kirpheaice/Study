package j2se8.ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Player
{
	private String name;
	private int no;
	Player(String name,int no)
	{
		this.name=name;
		this.no=no;
	}
	public String getName()
	{
		return name;
	}
	
	public int getNo()
	{
		return no;
	}
	
	public String toString()
	{
		return String.format("Player:%s(%d)", name,no);
	}
}

public class PlayerDemo
{
	public static void main(String[] args)
	{
		List<Player> players=Arrays.asList
		(
			new Player("Kawhi Leonard",2),
			new Player("Chris Paul",3),
			new Player("Kyrie Irving",11),
			new Player("Paul George",24),
			new Player("Vince Carter",15)			
		);
		players.stream().filter(p->p.getNo()%2==0).
			map(Player::getName).
			map(String::toUpperCase).collect(Collectors.toList()).
			forEach(System.out::println);
	}

}
