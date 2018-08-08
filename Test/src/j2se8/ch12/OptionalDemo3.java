package j2se8.ch12;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo3
{

	public static void main(String[] args)
	{
		Optional<String> optionalNickname=getNickName("3");
//		String nickname="XXX";
//		if(optionalNickname.isPresent())
//			nickname=optionalNickname.get();
//		System.out.println(nickname);
		System.out.println(optionalNickname.orElse("XX"));
	}
	static Optional<String> getNickName(String name)
	{
		Map<String,String> nicknames=new HashMap<>();
		nicknames.put("3", "Chris Paul");
		nicknames.put("9", "Tony Parker");
		nicknames.put("15","Vince Carter");
		String x=nicknames.get(name);
		return x==null?Optional.empty():Optional.of(x);

	}

}
