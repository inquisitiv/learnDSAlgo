package com.nidhi.solutions;

// https://www.youtube.com/watch?v=9lcg25S6Qyk&index=5&list=PLJse9iV6ReqhrZyq301AtJuC6butyhmLY
// http://www.sanfoundry.com/java-program-implement-avl-tree/
public class AVLTree {

	private AVLnode root;  
	int count =0;
	
	/*constructor*/
	public AVLTree()
	{
		root = null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void makeEmpty()
	{
		root = null;
	}
	
	public int height(AVLnode n)
	{
		return n==null?-1:n.getHeight();	
	}
	
	/*utility*/
	public int max(int lhs, int rhs)
	{
		return lhs>rhs?lhs:rhs;
		
	}
	public void insert(int data)
	{
		root = insert(data,root);
		
	}
	/*insert data in AVLTree*/
	public AVLnode insert(int data, AVLnode t)
	{
		if(t==null)
			t=new AVLnode(data);
		else
		{
	       if(data<=t.getData())
	       {
	    	   t.setLeft(insert(data,t.getLeft()));
	    	   if(height(t.getLeft())-height(t.getRight()) == 2 )
	    	   {
	    		   if(data<=t.getLeft().getData())
	    		      t = singleRotateWithLeftChild(t);
	    		   else
	    			  t = doubleRotateWithLeftChild(t);
	    			   
	    	   }
	    	   
	       }
	       else if(data>t.getData())
	       {
	    	   t.setRight(insert(data,t.getRight()));
	    	   if(height(t.getLeft())-height(t.getRight()) == -2 )
	    	   {
	    		   if(data>t.getRight().getData())
	    		      t = singleRotateWithRightChild(t);
	    		   else
	    			  t = doubleRotateWithRightChild(t);
	    			   
	    	   }
	    	   
	       }
		}
		t.setHeight(max(height(t.getLeft()),height(t.getRight()))+1);
		return t;
		
	}
	public AVLnode singleRotateWithLeftChild(AVLnode k2)
	{
		AVLnode k1 = k2.getLeft();
		k2.setLeft(k1.getRight());
		k1.setRight(k2);
		k2.setHeight(max(height(k2.getLeft()),height(k2.getRight()))+1);
		k1.setHeight(max(height(k2.getLeft()),height(k2.getRight()))+1);
		return k1;
	}
	public AVLnode singleRotateWithRightChild(AVLnode k1)
	{

		AVLnode k2 = k1.getRight();
		k1.setRight(k2.getLeft());
		k2.setLeft(k1);
		k2.setHeight(max(height(k2.getLeft()),height(k2.getRight()))+1);
		k1.setHeight(max(height(k2.getLeft()),height(k2.getRight()))+1);
		return k2;
	}
	public AVLnode doubleRotateWithLeftChild(AVLnode k3)
	{
		k3.setLeft(singleRotateWithRightChild(k3.getLeft()));
	    return singleRotateWithLeftChild(k3);
	}
	public AVLnode doubleRotateWithRightChild(AVLnode k3)
	{
		k3.setRight(singleRotateWithLeftChild(k3.getRight()));
	    return singleRotateWithRightChild(k3);
	}
	
	/*count number of nodes*/
	public int countNodes()
	{
		return countNodes(root);
	}
	public int countNodes(AVLnode r)
	{
		if(r==null)
			return 0;
		else
		{
			int l = 1;
			l+=countNodes(r.getLeft());
			l+=countNodes(r.getRight());
			return l;
		}
	}
	
	/*search an element*/
	public boolean search(int element)
	{
		return search(root, element);
		
	}
	
	public boolean search(AVLnode r, int element)
	{
		boolean found = false;
		while((r!= null)&&!found)
		{
			int rval = r.getData();
			if(element<rval)
				r=r.getLeft();
			else if(element>rval)
				r=r.getRight();
			else 
				{
				found = true;
				break;
				}
			found = search(r, element);
		}
			return found;
	}
	
	public String[] inorder(String[] theArray)
	{
		return inorder(root,theArray);
	}
	public String[] inorder(AVLnode r, String[] array)
	{
		if(r!=null)
		{
			inorder(r.getLeft(),array);
			//System.out.print(r.getData()+" ");
			array[count++]=String.valueOf(r.getData());
			inorder(r.getRight(),array);
		}
		return array;
	}
	
	public void preorder()
	{
		preorder(root);
	}
	public void preorder(AVLnode r)
	{
		if(r!=null)
		{
			System.out.print(r.data+" ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}
	
	public void postorder()
	{
		postorder(root);
	}
	public void postorder(AVLnode r)
	{
		if(r!=null)
		{
			preorder(r.getLeft());
			preorder(r.getRight());
			System.out.print(r.data+" ");
		}
	}
	
}
