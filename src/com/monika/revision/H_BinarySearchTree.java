package com.monika.revision;

import com.nidhi.solutions.BSTnode;

public class H_BinarySearchTree {
	
	H_BSTNode root;
	int count;
	
	public H_BinarySearchTree()
	{
		root = null;
		count = 0;
	}

	public H_BinarySearchTree(H_BSTNode n)
	{
		root = n;
		count = 1;
	}
	
	public void insert(int data)
	{
		root = insert(root, data);
	}
	
	public H_BSTNode insert(H_BSTNode node, int data)
    {
        if (node == null)
            node = new H_BSTNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        
        return node;
    }
	
	public void delete(int k)
	{
	   if(isEmpty())
	   {
		   System.out.println("Tree is Empty!");
	   }
	   else
	   {
		   root = delete(root,k);
	   }
	}
	
	public H_BSTNode delete(H_BSTNode node, int k)
	{
	   if(node.getData()==k)
	   {
		   H_BSTNode tempNode;
		   H_BSTNode lt,rt;
		   lt=node.getLeft();
		   rt=node.getRight();
		   if(lt==null)
			   return rt;
		   if(rt==null)
			   return lt;
		   tempNode=rt;
		   while(tempNode.getLeft()!=null)
			   tempNode=tempNode.getLeft();
		   tempNode.setLeft(lt);
		   return rt;
	   }
	
	   if(k<node.getData())
	   {
		   node = delete(node.left,k);
	   }
	   
	   if(k>node.getData())
	   {
		  H_BSTNode n = delete(node.right,k); 
	   }
	   
	   return root;
	}
	
	 /* Function for inorder traversal */
    public void inorder()
    {
       inorder(root);
    }
	
	public void inorder(H_BSTNode node)
	{
		 if (node != null)
         {
             inorder(node.getLeft());
             //array[count++]=String.valueOf(root.getData());
             System.out.print(node.getData() +" ");
             inorder(node.getRight());
         }
		
	}
	
	 /* Function for inorder traversal */
    public void preorder()
    {
       preorder(root);
    }
    
	public void preorder(H_BSTNode node)
	{
		 if (node != null)
         {
			 System.out.print(node.getData() +" ");
             preorder(node.getLeft());
             //array[count++]=String.valueOf(root.getData());
             preorder(node.getRight());
         }
		
	}
	
	 /* Function for inorder traversal */
    public void postorder()
    {
    	postorder(root);
    }
	
	public void postorder(H_BSTNode node)
	{
		 if (node != null)
         {
			 postorder(node.getLeft());
             //array[count++]=String.valueOf(root.getData());
			 postorder(node.getRight());
			 System.out.print(node.getData() +" ");
         }
		
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
}
