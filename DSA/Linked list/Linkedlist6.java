//to find mid of dyanmic list
class Linkedlist6
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
	
	public void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;	
	}
	
	public void mid()
	{
		Node n=head;
		Node p=head;
		Node d=null;
		int count=0;
		while(n != null && n.next != null)
		{
			count++;
			d=p;
			n=n.next.next;
			p=p.next;
		}
		if(count%2==0)
			System.out.println(d.data);
		else
			System.out.println(p.data);
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
		Linkedlist6 l1 = new Linkedlist6();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		l1.head.next=second;
		second.next=third;
		third.next=four;
		l1.insert(65);
		l1.insert(75);
		l1.insert(85);
		l1.insert(25);
		l1.display();
		System.out.println();
		l1.mid();
		
	}
}