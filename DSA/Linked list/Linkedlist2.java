// deleteNode
class Linkedlist2
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
	
	public void deleteNode(int position)
	{
		if(head == null)
			return;
		if(position == 0)
		{
			head=head.next;
			return;
		}
		Node temp = head;
		for(int i=0;i<position-1 && temp != null; i++)
			temp=temp.next;
		if(temp == null && temp.next == null)
			return;
		temp.next=temp.next.next;
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
		Linkedlist2 l1 = new Linkedlist2();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		l1.head.next=second;
		second.next=third;
		third.next=four;
	
		l1.deleteNode(2);
		l1.display();
	}
}