// new node insert
class DLL1
{
	Node head;
	
	static class Node
	{
		Node prev;
		Node next;
		int data;
		
		Node(int d)
		{
			prev = null;
			next = null;
			data = d;
		}
	}
	public void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
		head.next.prev=new_node;
	}
	
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head == null)
		{
			head=new Node(new_data);
			return;
		}
		Node last=head;
		while(last.next != null)
		{
			last=last.next;
		}
		last.next=new_node;
		new_node.prev=last;
	}
	
	public void addbetween(Node prev_node, int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("the given previous node is empty");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		new_node.prev=prev_node;
		prev_node.next=new_node;
		new_node.next.prev=new_node;	
	}
	
	public void display()
	{
		Node n= head;
		while(n != null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print("#");
	}
	
	public static void main(String args[])
	{
		DLL1 l1= new DLL1();
		l1.head= new Node(10);
		Node second= new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l1.head.next=second;
		second.next=third;
		third.next=fourth;
		
		l1.insert(1);
		l1.display();
		l1.addbetween(l1.head.next.next,25);
		l1.addbetween(third,35);
		l1.append(50);
		l1.display();
	}
}