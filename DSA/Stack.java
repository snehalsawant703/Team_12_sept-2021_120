// Stack implementation using array
class Stack
{
	final static int max=5;
	int TOP;
	int s[]=new int[max];
	
	Stack()
	{
		TOP=-1;
	}
	
	boolean isEmpty()
	{
		return (TOP < 0);
	}
	
	boolean isFull()
	{
		return (TOP > (max-1));
	} 
	
	boolean push(int x)
	{
		if(TOP >= (max-1))
		{
			System.out.println(" Stack overflow... !!!!!");
			return false;
		}
		else
		{
			s[++TOP]=x;
			//System.out.println("Push :"+x);
			return true;
		}
	}
	
	int pop()
	{
		if(TOP < 0)
		{
			System.out.println("Stack underflow...!!!");
			return 0;
		}
		else
		{
			int x=s[TOP--];
			return x;
		}
	}
	
	int peek()
	{
		if(TOP < 0)
		{
			System.out.println("Stack underflow...!!!");
			return 0;
		}
		else
		{
			int x= s[TOP];
			return x;
		}
	}
	
	void display()  // normal stack o/p
	{
		for(int i=TOP;i>-1;i--)
		System.out.println(s[i]+" ");
	}
	
	/* void display1()  // reverse stack o/p
	{
		for(int i=0;i<=TOP;i++)
		System.out.println(s[i]+" ");
	} */
	
	public static void main(String...args)
	{
		Stack s=new Stack();
		s.push(20);
		s.push(5);
		s.push(75);
		s.push(33);
		s.push(100);
		s.display();
		//System.out.println(s.peek());
		
		//s.display1();
	}
}