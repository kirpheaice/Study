package j2se8.ch10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Member
{
	private String number;
	private String name;
	private int age;
	
	public Member(String name,String number,int age)
	{
		this.age=age;
		this.name=name;
		this.number=number;
	}
	
	@Override
	public String toString()
	{
		return String.format("name:%s,number:%s,age:%d%n", this.name,this.number,this.age);
	}
	
	public void save() throws IOException
	{
		try(DataOutputStream out=new DataOutputStream(new FileOutputStream(number)))
		{
			out.writeUTF(name);
			out.writeUTF(number);
			out.writeInt(age);
		}
	}
	
	public static Member load(String number) throws IOException
	{
		Member member=null;
		try(DataInputStream in=new DataInputStream(new FileInputStream(number)))
		{
			member=new Member(in.readUTF(), in.readUTF(), in.readInt());
		}
		return member;
	}
}
