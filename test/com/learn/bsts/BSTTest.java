package com.learn.bsts;

public class BSTTest {

	public static void main(String args[])
	{
		BST bst = new BST();
		bst.insert(7);
		bst.insert(10);
		bst.insert(12);
		bst.insert(5);
		bst.insert(4);
		bst.insert(3);
		bst.insert(6);
		bst.insert(1);
		bst.insert(8);
		
		bst.inorder();
		
		
		//bst.preorder();
		//bst.postorder();
		System.out.println();
		bst.delete(12);
		
		bst.inorder();
		//System.out.println(bst.search(8)!=null?"Found: "+bst.search(8).getData():"not found");
		//System.out.println(bst.searchRecursive(3)!=null?"Found: "+bst.searchRecursive(3).getData():"not found");
		
		
		
		
	}
	
}
