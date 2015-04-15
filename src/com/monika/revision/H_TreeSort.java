package com.monika.revision;


public class H_TreeSort {

	public void sort(int[] array)
	{
		H_BinarySearchTree bst = new H_BinarySearchTree();
		
		for(int element:array)
			bst.insert(element);
		
		bst.inorder();
		System.out.println();
		//bst.preorder();
		//System.out.println();
		//bst.postorder();
		
	}
	
}
