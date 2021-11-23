// BST implementation (insert) and preorder postorder inorder
class BSTtraversal
{
	Node root;
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=right=null;
		}
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
	
	Node insertdata(Node root, int new_data)
	{
		if(root == null)
		{
			root=new Node(new_data);
			return root;
		}
		if(new_data <= root.data)
			root.left=insertdata(root.left, new_data);
		else
			root.right=insertdata(root.right, new_data);
		
		return root;
	}
	
	void insert(int d)
	{
		root=insertdata(root, d);
	}
	
	
	public static void main(String...args)
	{
		BSTtraversal t1=new BSTtraversal();
		t1.insert(30);
		t1.insert(25);
		t1.insert(75);
		t1.insert(50);
		t1.insert(100);
		t1.insert(75); 
		
		t1.Preorder();
		t1.Postorder();
		t1.Inorder();
		
	}		
}