package j2se8.ch9;

import java.util.LinkedList;
import java.util.Queue;

interface Request
{
	void execute(int index);
}

public class RequestQueue
{
	public static void main(String[] args)
	{
		Queue requests=new LinkedList();
		offerRequestTo(requests);
		process(requests);
	}
	
	static void offerRequestTo(Queue requests)
	{
		for(int i=1;i<6;i++)
		{
			Request r=index->System.out.printf("Random Data=(%d)%f%n",index,Math.random());
//			Request r=new Request(){
//
//				@Override
//				public void execute(int index)
//				{
//					System.out.printf("Random Data=(%d)%f%n",index,Math.random());
//				}
//			};
			requests.offer(r);
		}
	}
	
	static void process(Queue requests)
	{
		int index=0;
		while(requests.peek()!=null)
		{
			index++;
			Request r=(Request)requests.poll();
			r.execute(index);
		}
	}
}
