// implementation of stack using linked list
class Node                                    // A Linked List Node
{
    int data;                                 // integer data
    Node next;                                // pointer to the next node
}
 
class Stack
{
    private Node top;
 
    public Stack() 
	{
        this.top = null;
    }
 
    public void push(int x)        // insert at the beginning
    {
        Node node = new Node();
 
        if (node == null)
        {
            System.out.print("\nHeap Overflow");
            return;
        }
       // System.out.println("Inserting " + x);
        node.data = x;                                 // set data in the allocated node
        node.next = top;
        top = node;
    }

    public boolean isEmpty() {
        return top == null;
    }
 
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
 
    public void pop()                            // remove at the beginning
    {
        if (top == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }
       // System.out.println("Removing " + peek());
        top = (top).next;
    }
	
	public void display()
	{
		Node n = top;
		while(n != null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print("#");
	}
}
 
class StackLS
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
 
        stack.push(1);
        stack.push(2);
        stack.push(3);
		stack.display();
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }
		
		stack.display();
    }
}

