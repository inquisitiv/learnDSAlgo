package com.learn.stacks;

public class Stack {

	Node top;
	
	public Stack()
	{
		top=null;
	}
	
	public void push(char c)
	{ 
		if(top==null)
			top=new Node(c);
		else
		{
		Node temp=new Node(c);
		temp.setNext(top);
		top=temp;
		}
	}
	
	public char pop()
	{ 
		if(top==null)
			return ' ';
		else
			{
			 char c = top.getData();
			 top=top.getNext();
			 return c;
			}
	}
	
}
