package data.structure.basic.structures;

import java.util.Iterator;

import data.structure.nodes.LNode;

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
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(newNode);
		}
		
	}
	
	public void deleteFromFront(){
		
		if(start==null)
			return;
		else
		   start = start.getNext();
		
	}
	
    public void deleteFromEnd(){
		
		if(start==null)
			return;
		if(start.getNext()==null)
		{
			start=null;
			return;
		}
		
		  LNode<Item> prev = start; 
		  LNode<Item> temp = start.getNext(); 
		   while(temp.getNext()!=null)
		   {
			   prev= temp;
			   temp=temp.getNext();
		   }
		   prev.setNext(null);
		
	}
    
    public void deleteItem(Item item){
		
		if(start==null)
			return;
		if(start.getData()==item)
		{
			start=null;
			return;
		}
		else
		{
		  LNode<Item> prev = start; 
		  LNode<Item> temp = start.getNext(); 
		   while(temp!=null)
		   {
			   if(temp.getData()==item)
				   prev.setNext(temp.getNext());
			   prev= temp;
			   temp=temp.getNext();
			   
		   }
		}
		
	}

      public LNode<Item> findNode(Item item){
		
		if(start==null)
			return null;
		if(start.getData()==item)
		{
			return start;
		}
		else
		{ 
		  LNode<Item> temp = start.getNext(); 
		   while(temp!=null)
		   {
			   if(temp.getData()==item)
				   return temp;
			   temp=temp.getNext();
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
			Item item = current.getData();
			current = current.getNext();
			return item;
		}

		@Override
		public void remove() {
			// not supported		
		}
		
	}

}
