package com.nidhi.solutions;

public class BinarySearchTree {

	 private BSTnode root;
	 int count = 0;
	 
	 /* Constructor */
     public BinarySearchTree()
     {
         root = null;
     }
     
     /* Function to check if tree is empty */
     public boolean isEmpty()
     {
         return root == null;
     }
     
     /* Functions to insert data */
     public void insert(int data)
     {
         root = insert(root, data);
     }
     
     /* Function to insert data recursively */
     private BSTnode insert(BSTnode node, int data)
     {
         if (node == null)
             node = new BSTnode(data);
         else
         {
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
     /* Functions to delete data */
     public void delete(int k)
     {
         if (isEmpty())
             System.out.println("Tree Empty");
         else if (search(k) == false)
             System.out.println("Sorry "+ k +" is not present");
         else
         {
             root = delete(root, k);
             System.out.println(k+ " deleted from the tree");
         }
     }
     private BSTnode delete(BSTnode root, int k)
     {
         BSTnode p, p2, n;
         if (root.getData() == k)
         {
             BSTnode lt, rt;
             lt = root.getLeft();
             rt = root.getRight();
             if (lt == null && rt == null)
                 return null;
             else if (lt == null)
             {
                 p = rt;
                 return p;
             }
             else if (rt == null)
             {
                 p = lt;
                 return p;
             }
             else
             {
                 p2 = rt;
                 p = rt;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(lt);
                 return p2;
             }
         }
         if (k < root.getData())
         {
             n = delete(root.getLeft(), k);
             //root.setLeft(n);
         }
         else
         {
             n = delete(root.getRight(), k);
             //root.setRight(n);             
         }
         return root;
     }
     
     /* Functions to count number of nodes */
     public int countNodes()
     {
         return countNodes(root);
     }
     /* Function to count number of nodes recursively */
     private int countNodes(BSTnode r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     
     /* Functions to search for an element */
     public boolean search(int val)
     {
         return search(root, val);
     }
     
     /* Function to search for an element recursively */
     private boolean search(BSTnode r, int val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.getData();
             if (val < rval)
                 r = r.getLeft();
             else if (val > rval)
                 r = r.getRight();
             else
             {
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
     
     /* Function for inorder traversal */
     public String[] inorder(String[] array)
     {
         return inorder(root,array);
     }
     
     private String[] inorder(BSTnode r, String[] array)
     {
         if (r != null)
         {
             inorder(r.getLeft(),array);
             array[count++]=String.valueOf(r.getData());
             //System.out.print(r.getData() +" ");
             inorder(r.getRight(),array);
         }
		return array;
     }
     
     /* Function for preorder traversal */
     public void preorder()
     {
         preorder(root);
     }
     
     private void preorder(BSTnode r)
     {
         if (r != null)
         {
        	 System.out.print(r.getData() +" ");
             preorder(r.getLeft());
             preorder(r.getRight());
         }
     }
     /* Function for postorder traversal */
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(BSTnode r)
     {
         if (r != null)
         {
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     }     
}