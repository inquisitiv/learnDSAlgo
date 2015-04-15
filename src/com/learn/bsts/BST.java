package com.learn.bsts;

public class BST {

	Node root;
	
	public BST()
	{
		root=null;
	}
	
	public void insert(int data)
	{
		if(root==null)
			root=new Node(data);
		else
			insert(root,data);
	}
	
	public void insert(Node node, int data)
	{
		if(data<node.getData())
		{
			if(node.getLeft()==null)
		    node.setLeft(new Node(data));
			else
			insert(node.getLeft(), data);
		}
		else if(data>node.getData())
		{
			if(node.getRight()==null)
			node.setRight(new Node(data));
			else
			insert(node.getRight(), data);
		}
	}
	
	public void inorder()
	{
		inorder(root);
	}
	
	public void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.getLeft());
		System.out.print(node.getData()+" ");
		inorder(node.getRight());
	}
	
	public void preorder()
	{
		preorder(root);
	}
	
	public void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.getData());
		preorder(node.getLeft());
		preorder(node.getRight());
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	public void postorder(Node node)
	{
		if(node==null)
			return;
		postorder(node.getLeft());
		postorder(node.getRight());
		System.out.print(node.getData());
	}
	
	public Node search(int data)
	{
		if(root==null)
			return null;
		Node node=root;
		while(node!=null)
		{
			if(data<node.getData())
				node=node.getLeft();
			else if(data>node.getData())
				node=node.getRight();
			else
				return node;
		}
		return null;
	}
	
	public Node searchRecursive(int data)
	{
		 return searchRecursive(root,data);
	}
	public Node searchRecursive(Node node,int data)
	{
		if(node==null)
			return null;
		else if(node.getData()==data)
			return node;
		else if(node.getData()>data)
			return searchRecursive(node.getLeft(),data);
		else if(node.getData()<data)
			return searchRecursive(node.getRight(),data);
		return null;
	}
	
	public Node getMin(Node auxRoot)
	{
	  if(auxRoot.getLeft()==null)
		  return auxRoot;
	  else
		  return getMin(auxRoot.getLeft());
	}
	
	public Node delete(int data) {

	    if(root==null)
	    	return null;
		Node prevNode = new Node(0);
		prevNode.setLeft(root);
	    return delete(prevNode, root, data, false);
		
	}
	public Node delete(Node prevNode, Node node, int data, boolean drctn) {

	    if(data<node.getData())
	    {
	    	return delete(node, node.getLeft(), data, false);
	    }
	    
	    if(data>node.getData())
	    {
	    	return delete(node, node.getRight(), data, true);
	    }
	    
	    if(data==node.getData()) 
	    {
	    	if(node.getLeft()==null&&node.getRight()==null)
	    	{
	    		if(drctn==true)
	    			prevNode.setRight(null);
	    		else
	    			prevNode.setLeft(null);
	    	}
	    	else if(node.getLeft()==null)
	    	{
	    		if(drctn==true)
	    			prevNode.setRight(node.getRight());
	    		else
	    			prevNode.setLeft(node.getRight());
	    	}
	    	else if(node.getRight()==null)
	    	{
	    		if(drctn==true)
	    			prevNode.setRight(node.getLeft());
	    		else
	    			prevNode.setLeft(node.getRight());
	    	}
	    	else 
	    	{
	    		if(drctn==true)
	    			prevNode.setRight(node.getLeft());
	    		else
	    			prevNode.setLeft(node.getRight());
	    		
	    	}
	    	
	    }
	    
	    return root;
	    
	}
	

}
