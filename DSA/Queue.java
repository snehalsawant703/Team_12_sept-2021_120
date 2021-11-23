//implementation of queue
class Queue
{
	int size=5;
	int Q[]=new int[size];
	int front, rare;
	
	Queue()
	{
		front = -1;   
		rare = -1;
	}
	
	boolean isempty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	boolean isfull()
	{
		if((rare == size-1)&&(front==0))
			return true;
		else
			return false;
	}
	
	void enqueue(int x)
	{
		if(isfull())
			System.out.println(" the queue is full");
		else
		{
			if(front==-1)
				front=0;
				rare++;
				Q[rare]=x;
				System.out.println("inserted");
			
		}
	}
	
	int dequeue()
	{
		int x;
		if(isempty())
		{
			System.out.println(" the queue is empty");
			return -1;
		}
		else
		{
			x=Q[rare];
			if(front>=rare) //reset queue
			{
				front = -1;   
				rare = -1;
			}
			else
			{
				front++;
			}
			System.out.println("deleted");
			return x;
		}
	}
	
	void display()
	{
		if (isempty())
			System.out.println("queue is empty");
		else
		{
			for(int i=front;i<=rare;i++)
			{
				System.out.println(Q[i]);
			}
		}
	}
	
	public static void main(String args[])
	{
		Queue q1=new Queue();
		
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(7);
		q1.enqueue(8);
		q1.dequeue();
		q1.display();
	}
}