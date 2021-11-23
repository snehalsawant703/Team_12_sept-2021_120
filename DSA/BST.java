class BST
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
	
	Node deleteData(Node root, int key)
	{
		//Empty tree
		if (root == null)
			return root;

		
		if (key < root.data)
			root.left = deleteData(root.left, key);
		else if (key > root.data)
			root.right = deleteData(root.right, key);


		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			return root;

			// node with two children: Get the inorder
			// successor (smallest in the right subtree)
			root.data = minvalue(root.right);

			// Delete the inorder successor
			root.right = deleteData(root.right, root.data);
		}

		return root;
	}
	
	void delete(int d)
	{
		root=deleteData(root, d);
	}
	
	int minvalue(Node root)
	{
		int x = root.data;
		while(root.left != null)
		{
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	
	public static void main(String...args)
	{
		BST t1=new BST();
		t1.insert(30);
		t1.insert(25);
		t1.insert(75);
		t1.insert(50);
		t1.insert(100);
		t1.insert(75); 
		
		t1.Preorder();
		t1.delete(50);
		t1.Preorder();
	}		
}