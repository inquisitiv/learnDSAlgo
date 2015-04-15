package com.learning.dsfundamental.questions;

public class SLLtoBalancedTree<Item> {
	
	LNode<Item> node;
	public TNode<Item> convert (SLL<Item> singlyList)
	{
		int totalcount=0;
		for(@SuppressWarnings("unused") Item item : singlyList)
		{
			totalcount++;
		}
		node = singlyList.start;		
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
		node=node.next;
		root.right = toTree(count - count/2 -1);
		return root;
	}

}
