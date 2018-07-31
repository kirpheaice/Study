package j2se8.ch9;

import java.util.LinkedList;
import java.util.Queue;

interface Request2
{
	void execute();
}

public class RequestQueue2
{
	public static void main(String[] args)
	{
		Queue<Request2> requests=new LinkedList<>();
		offerRequestTo(requests);
		process(requests);
	}
	
	static void offerRequestTo(Queue<Request2> requests)
	{
		for(int i=1;i<6;i++)
			requests.offer(()->System.out.printf("%f %n",Math.random()));
	}
	
	static void process(Queue<Request2> requests)
	{
		while(requests.peek()!=null)
			(requests.poll()).execute();
	}
}
