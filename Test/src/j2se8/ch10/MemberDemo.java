package j2se8.ch10;

import java.io.IOException;

public class MemberDemo
{

	public static void main(String[] args) throws IOException
	{
		Member[] members={
				new Member("Alex","1",10),
				new Member("Alen","2",20),
				new Member("Alec","3",30)
		};
		for(Member m:members)
			m.save();
		
		System.out.println(Member.load("1"));
		System.out.println(Member.load("2"));
		System.out.println(Member.load("3"));
	}

}
