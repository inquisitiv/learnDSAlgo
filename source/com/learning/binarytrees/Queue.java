package com.learning.binarytrees;

public class Queue {

	LinkedListNode front;
	LinkedListNode rear;
	
	public Queue()
	{
		front = null;
		rear = null;
	}
	
	public void enQueue(Node data)
	{
		LinkedListNode temp = new LinkedListNode(data);
		if(front==null && rear == null)
		{
		   	front = temp;
		   	rear =temp;
		}	
		else
		{
			rear.setNext(temp);
			rear=temp;
		}
	}
	
	public Node deQueue()
	{
		if(front==null && rear==null)
		{
			return null;
		}
		Node temp = front.getData();
		if(front==rear)
		{
			front=null;
			rear=null;
			return temp;
		}
		else
		{
		   front= front.getNext();
		   return temp;
		}
	}
	
	public boolean isEmpty(){
		if(front==null && rear==null)
			return true;
		return false;
	}
	
	public void delete()
	{
		front=null;
		rear=null;
	}
	
    public int size()
    {
    	if(front==null && rear==null)
			return 0;
    	if(front==rear)
		{
			return 1;
		}
    	LinkedListNode temp=front; 
    	int size=0;
    	while(temp!=null)
    	{
    		size++;
    	    temp=temp.next;
    	}
    	return size;
    }
	
}

