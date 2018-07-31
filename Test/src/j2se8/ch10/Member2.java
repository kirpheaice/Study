package j2se8.ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Member2 implements Serializable
{
	private String number;
	private String name;
	private int age;

	public Member2(String name,String number,int age)
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
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(number)))
		{
			out.writeObject(this);
		}
	}
	
	public static Member2 read(String number) throws IOException, ClassNotFoundException
	{
		Member2 member2=null;
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(number)))
		{
			member2=(Member2)in.readObject();
		}
		return member2;
	}

}
