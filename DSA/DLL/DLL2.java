// delete node
class DLL2
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
	
	public void deleteNode(int position)
	{
		if(head == null)
			return;
		if(position == 0)
		{
			head=head.next;
			return;
		}
		Node n= head;
		for(int i=0; i<=position-1 &&  n != null ;i++)
			n=n.next;
		if(n.next == null && n == null)
			return;
			n.next=n.next.next;
			
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
		DLL2 l1= new DLL2();
		l1.head= new Node(10);
		Node second= new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l1.head.next=second;
		second.next=third;
		third.next=fourth;
		
		l1.display();
		l1.deleteNode(2);
		l1.display();
	}
}