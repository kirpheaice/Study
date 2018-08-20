package j2se8.ch17;

import java.util.HashMap;
import java.util.Map;

public class P1714
{

	public static void main(String[] args) throws Exception
	{
		Map<String,Object> data=new HashMap<>();
		data.put("name", "Jack");
		data.put("score", 1);
		Student s=(Student) BeanUtil.getBean(data, "j2se8.ch17.Student");
		System.out.println(s.getName());
		System.out.println(s.getScore());
	}

}
