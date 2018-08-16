package j2se8.ch17;

import static java.lang.System.out;

class Some2
{
	static
	{
		out.println("Some 2");
	}
}

public class SomeDemo2
{
	public static void main(String[] args) throws Exception
	{
		Class clz=Class.forName("j2se8.ch17.Some2",false,SomeDemo2.class.getClassLoader());
		out.println("loads some2.class");
		Some2 s;
		out.println("宣告SOME2完成");
		s=new Some2();
		out.println("生成完成");
	}
}
