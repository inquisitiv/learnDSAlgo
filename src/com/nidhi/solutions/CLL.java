package com.nidhi.solutions;

public class CLL {
	
	private LinkedListNode tail;
	private int length;
	
	public CLL()
	{
		tail=null;
		length=0;
	}
	
	public CLL(int data)
	{
		tail=new LinkedListNode(data);
		tail.setNext(tail);
		length=1;
	}

	public int getLength()
	{
		return length;
	}
	
	public LinkedListNode getTail()
	{
		return tail;
	}
	
	public void insert(int data)
	{
		if(tail==null)
		{
			tail=new LinkedListNode(data);
			tail.setNext(tail);
			length=1;
		}
		else
		{
			LinkedListNode newNode = new LinkedListNode(data);
			newNode.setNext(tail.getNext());
		    tail.setNext(newNode);
		    tail=newNode;
		    length++;
		}
	}
	
	public void insertAfter(int data, int toInsert)
	{
		LinkedListNode temp = tail.getNext();
		while(temp!=tail)
		{
			if(temp.getData()==data)
			{
				LinkedListNode newNode = new LinkedListNode(toInsert);
				newNode.setNext(temp.getNext());
			    temp.setNext(newNode);
			    temp=newNode;
			    length++;
			    break;
			}
			else
			temp=temp.getNext();
				
		}
	}
	
	
	public void delete()
	{
	   if(tail==null)
		   return;
	   else if(tail.getNext()==tail)
		{
			tail=null;
			length=0;
		}
	   else
	   {
		LinkedListNode temp = tail.getNext();
		tail.setNext(temp.getNext());
		temp=null;
		length--;
	   }
	}
	
	public void delete(int data)
	{
		if(tail==null)
			return;
		else if(tail.getNext()==tail)
		{
			if(tail.getData()==data)
			{
				tail=null;
				length=0;
			}
		}
		else
		{
		  LinkedListNode prev = tail;
		  LinkedListNode temp = tail.getNext();
		  if(temp.getData()==data)
		  {
			  prev.setNext(temp.getNext());
			  length--;
			  return;
		  }
		  prev=prev.getNext();
		  temp=temp.getNext();
		  
		  while(temp.getData()!=data)
		  {
			  if(prev==tail)
				  return;
			  prev=prev.getNext();
			  temp=temp.getNext();
		  }
			  prev.setNext(temp.getNext());
			  tail=prev;
			  temp=null;
			  length--;
		  
		}
		
	}
		
	
	public void clearList()
	{
		tail=null;
		length=0;
	}
	
	
	public void display()
	{
		if(tail==null)
			System.out.println("CLL is empty");
		else
		{
	    LinkedListNode p=tail;
	    System.out.print("-->"+p.getData());
		for(p=tail.getNext();p!=tail;p=p.getNext())
		{
			System.out.print("-->"+p.getData());
		}
		System.out.println();
		}
	}


}
