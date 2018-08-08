package j2se8.ch12;

import java.util.HashMap;
import java.util.Map;

public class OptionalDemo1
{

	public static void main(String[] args)
	{
		String nickname=getNickName("3");
		if(nickname==null)
			nickname="Curry";
		System.out.println(nickname);
	}
	static String getNickName(String name)
	{
		Map<String,String> nicknames=new HashMap<>();
		nicknames.put("3", "Chris Paul");
		nicknames.put("9", "Tony Parker");
		nicknames.put("15","Vince Carter");
		return nicknames.get(name);
	}
}
