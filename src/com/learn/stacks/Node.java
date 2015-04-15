package com.learn.stacks;

public class Node {
	
	char data;
	Node next;
	
	public Node(char data)
	{
		this.data=data;
		this.next=null;
	}
	
	public void setData()
	{
		this.data = data;
	}

	public char getData()
	{
		return data;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}

	public Node getNext()
	{
		return next;
	}

}
