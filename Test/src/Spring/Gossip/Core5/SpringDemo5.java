package Spring.Gossip.Core5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import Spring.Gossip.Core4.HelloBean;

public class SpringDemo5
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("beansConfig5.xml");
		HelloBean bean=(HelloBean)context.getBean("helloBean");
		System.out.println(bean.getHelloWord());
		System.out.println(bean.getDate());
		
	}
}
