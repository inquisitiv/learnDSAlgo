package com.learning.dsfundamental.questions;

public class DLLtoBalancedTree<Item> {
	
	TNode<Item> node;
	public TNode<Item> convert (DLL<Item> doublyList)
	{
		int totalcount=0;
		for(@SuppressWarnings("unused") Item item : doublyList)
		{
			totalcount++;
		}
		node = doublyList.start;		
		return toTree(totalcount);			
	}
	
	public TNode<Item> toTree (int count)
	{
		if(count<1)
		{
			return null;
		}
		TNode<Item> left = toTree(count/2);
		TNode<Item> root = new TNode<Item>(node.data);
		root.left = left;
		node=node.right;
		root.right = toTree(count - count/2 -1);
		return root;
	}

	public TNode<Item> convertInPlace(DLL<Item> doublyList)
	{
		int totalcount=0;
		for(@SuppressWarnings("unused") Item item : doublyList)
		{
			totalcount++;
		}
		node = doublyList.start;		
		return toTreeInPlace(totalcount);			
	}
	
	public TNode<Item> toTreeInPlace (int count)
	{
		if(count<1)
		{
			return null;
		}
		TNode<Item> left = toTree(count/2);
		TNode<Item> root = node;
		node.left = left;
		node=node.right;
		node.right = toTree(count - count/2 -1);
		return root;
	}
	
}
