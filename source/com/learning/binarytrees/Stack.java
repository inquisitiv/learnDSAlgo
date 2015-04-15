package com.learning.binarytrees;

import com.learning.binarytrees.Node;

public class Stack {
	
	LinkedListNode top;
	
	public Stack()
	{
		top = null;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(Node data)
	{
		if(top==null)
		{
			top=new LinkedListNode(data);
			top.setNext(null);
		}
		else
		{
			LinkedListNode temp = new LinkedListNode(data);
			temp.setNext(top);
			top=temp;			
		}
	}

	public Node pop()
	{
		if(top==null)
		  System.out.println("stack is empty");
		else
		{
		  Node temp;
		  temp = top.getData();
		  top = top.getNext();
		  return temp;
		}
		return null;
	}
	
	public Node top()
	{
		return top.getData();
	}
	
	public void delete(){
		top=null;
	}
	
}
