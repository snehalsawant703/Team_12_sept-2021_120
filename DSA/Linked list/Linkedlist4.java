// count nodes using iteration and recursion
class Linkedlist4
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;
		}
	}
	
	public void countNode()
	{
		Node c = head;
		int count=0;
		while(c != null)
		{
			count++;
			c=c.next;
		}
	    System.out.println(count);
	}
	
	public int countrec(Node n)
	{ 
		if(n == null)
			return 0;
		return 1 + countrec(n.next);
	}
	
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print("#");
	}
	
	public static void main(String args[])
	{
		Linkedlist4 l1 = new Linkedlist4();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		l1.head.next=second;
		second.next=third;
		third.next=four;
		l1.display();
		System.out.println();
		l1.countNode();
		System.out.println("count using recursion");
		System.out.println(l1.countrec(l1.head));
	}
}