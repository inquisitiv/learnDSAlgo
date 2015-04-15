package com.learning.dsfundamental.questions;

import java.util.Iterator;

public class DLL<Item> implements Iterable<Item> {
	
	TNode<Item> start;
	
	public DLL() {
		
		start = null;
	}

	public void insert(Item data)
	{
		if(start==null)
		{
			start = new TNode<Item>(data);
			start.left = null;
			start.right = null;
		}
		else
		{
			TNode<Item> temp = start;
			while(temp.right!=null)
			{
				temp=temp.right;
			}
			temp.right = new TNode<Item>(data);
			temp.right.left = temp;
		}
	}
	
	public void deleteFromFront()
	{
		if(start!=null)
		{
			start=start.right;
			start.left=null;
		}
	}
	
	public void deleteFromEnd()
	{
		if(start==null)
			return;
		TNode<Item> temp = start;
		while(temp.right!=null)
		{
			temp = temp.right;
		}
		temp.left.right =null;
	}
	
	public void deleteItem(Item item)
	{
		if(start==null)
			return;
		TNode<Item> temp = start;
		while(temp!=null)
		{
			if(temp.data==item)
			{
				temp.left.right = temp.right;
				temp.right.left = temp.left;
			}
			temp = temp.right;
		}
		
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new DLLIterator();
	}
	
	private class DLLIterator implements Iterator<Item> {

		TNode<Item> current = start;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item temp = current.data;
			current=current.right;
			return temp;
		}

		@Override
		public void remove() {
			// not supported
			
		}
		
	}
	
    public TNode<Item> findNode(Item item){
		
		if(start==null)
			return null;
		if(start.data==item)
		{
			return start;
		}
		else
		{ 
		  TNode<Item> temp = start.right; 
		   while(temp!=null)
		   {
			   if(temp.data==item)
				   return temp;
			   temp=temp.right;
		   }
		   return  null;
		}
		
	}
	
	public boolean isEmpty() {
		
		return start == null;
	}
	
}
