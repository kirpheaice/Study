package j2se8.ch10;

import java.io.IOException;

public class Member2Demo
{
	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		Member2[] member2s={
				new Member2("CAT", "D21", 15),
				new Member2("DOG", "D22", 25),
				new Member2("PIG", "D23", 35)
		};
		
		for(Member2 m:member2s)
			m.save();
		
		System.out.println(Member2.read("D22"));
	}
}
