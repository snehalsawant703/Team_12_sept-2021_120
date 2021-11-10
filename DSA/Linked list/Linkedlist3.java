// delete entire list
class Linkedlist3
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
	
	public void delete()
	{
		head=null;
		System.out.println("deleted");
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
		Linkedlist3 l1 = new Linkedlist3();
		
		l1.head=new Node(10);
		Node second=new Node(11);
		Node third=new Node(22);
		Node four=new Node(33);
		l1.head.next=second;
		second.next=third;
		third.next=four;
	
		l1.display();
		l1.delete();
		l1.display();
	}
}