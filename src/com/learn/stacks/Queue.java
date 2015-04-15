package com.learn.stacks;

public class Queue {
	
	Node front;
	Node rear;
	
	public Queue()
	{
		front = null;
		rear = null;
	}

	public void enQueue(char x)
	{
		if(front==null)
		{
			front = new Node(x);
			rear = front;
		}
		else
		{
		Node temp = new Node(x);
		temp.setNext(null);
		front.setNext(temp);
		front=temp;
		}
	}
	
	public char deQueue()
	{
		if(front==null&&rear==null)
			return ' ';
		char temp = rear.getData();
		if(front==rear)
	    {
		front=null;
		rear=null;
	    }
		else
		rear=rear.getNext();
		return temp;
	}
	
	public boolean isEmpty()
	{
		return (front==null&&rear==null);
	}
	
	
}
