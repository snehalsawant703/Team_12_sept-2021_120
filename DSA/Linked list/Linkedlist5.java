// searching
class Linkedlist5
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
	
	public void search(int key)
	{
		Node n=head;
		while(n != null)
		{
			if(n.data== key)
			{
				System.out.println(key + "found");
				return;
			}
			n=n.next;
		}
		System.out.println(key + "not found");
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
		Linkedlist5 l1 = new Linkedlist5();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		l1.head.next=second;
		second.next=third;
		third.next=four;
		l1.insert(65);
		l1.display();
		System.out.println();
		l1.search(54);
	}
}