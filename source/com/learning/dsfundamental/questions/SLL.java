package com.learning.dsfundamental.questions;

import java.util.Iterator;

public class SLL<Item> implements Iterable<Item>{
	
	LNode<Item> start;
	
	public SLL() {
		
		start = null;
	}
	
	public void insert(Item data) {
		
		if(start==null)
			start = new LNode<Item>(data);
		else
		{
			LNode<Item> newNode = new LNode<Item>(data);
			LNode<Item> temp=start;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next = newNode;
		}
		
	}
	
	public void deleteFromFront(){
		
		if(start==null)
			return;
		else
		   start = start.next;
		
	}
	
    public void deleteFromEnd(){
		
		if(start==null)
			return;
		if(start.next==null)
		{
			start=null;
			return;
		}
		
		  LNode<Item> prev = start; 
		  LNode<Item> temp = start.next; 
		   while(temp.next!=null)
		   {
			   prev= temp;
			   temp=temp.next;
		   }
		   prev.next = null;
		
	}
    
    public void deleteItem(Item item){
		
		if(start==null)
			return;
		if(start.data==item)
		{
			start=null;
			return;
		}
		else
		{
		  LNode<Item> prev = start; 
		  LNode<Item> temp = start.next; 
		   while(temp!=null)
		   {
			   if(temp.data==item)
				   prev.next = temp.next;
			   prev= temp;
			   temp=temp.next;
			   
		   }
		}
		
	}

      public LNode<Item> findNode(Item item){
		
		if(start==null)
			return null;
		if(start.data==item)
		{
			return start;
		}
		else
		{ 
		  LNode<Item> temp = start.next; 
		   while(temp!=null)
		   {
			   if(temp.data==item)
				   return temp;
			   temp=temp.next;
		   }
		   return  null;
		}
		
	}
    
	public boolean isEmpty() {
		
		return start == null;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new SLLIterator();
	}
	
	private class SLLIterator implements Iterator<Item>
	{

		LNode<Item> current = start;
		
		@Override
		public boolean hasNext() {
			
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.data;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// not supported		
		}
		
	}

}
