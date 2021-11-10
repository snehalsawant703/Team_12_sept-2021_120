//insert, append, addbetween
class Linkedlist1
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
	
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head == null)
		{
			head=new Node(new_data);
			return;
		}
		Node last=head;
		while(last.next!= null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	
	public void addbetween(Node prev_node, int new_data)
	{
		while(prev_node == null)
		{
			System.out.println("The given previous node is null");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
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
		Linkedlist1 l1 = new Linkedlist1();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		Node abc= null;   //throws
		l1.head.next=second;
		second.next=third;
		third.next=four;
		
		l1.insert(55);
		l1.insert(44);
		l1.append(66);
		l1.addbetween(l1.head, 12);
		//l1.addbetween(l1.head.next.next, 15);
		l1.addbetween(second, 15);
		l1.addbetween(abc,25);
		l1.append(20);
		l1.display();
	}
}