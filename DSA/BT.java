class BT
{	
	Node root;
	static class Node
	{
		Node left;
		Node right;
		int data;
		
		Node(int d)
		{
			left= null;
			right =null;
			data = d;
		}
	}
	
	BT()
	{
		root = null;
	}
	
	BT(int new_data)
	{
		root= new Node(new_data);
	}
	
	void Inorder(Node node)
	{
		if(node == null)
			return;
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
		
	}
	
	void Preorder(Node node)
	{
		if(node == null)
			return;
		System.out.print(node.data+" ");
		Preorder(node.left);
		Preorder(node.right);
	}
	
	void Postorder(Node node)
	{
		if(node == null)
			return;
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.data+" ");
		
	} 
	
	void Inorder()
	{
		Inorder(root);
	}
	
	void Preorder()
	{
		Preorder(root);
	}
	
	void Postorder()
	{
		Postorder(root);
	}
	
	public static void main(String... args)
	{
		BT t1= new BT();
		t1.root=new Node(15);
		t1.root.left=new Node(45);
		t1.root.right=new Node(100);
		t1.Inorder();
		System.out.println();
		t1.Preorder();
		System.out.println();
		t1.Postorder();
		
	}
}