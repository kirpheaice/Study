package j2se8.ch15;

import java.util.Locale;
import java.util.ResourceBundle;

public class Hello
{

	public static void main(String[] args)
	{
		Locale locale=new Locale("en","US");
		
		ResourceBundle res=ResourceBundle.getBundle("msg",locale);
		
		System.out.println(res.getString("msg1"));
	}

}
