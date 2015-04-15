package com.learn.stacks;

public class StackInt {

	NodeInt top;
	
	public StackInt()
	{
		top=null;
	}
	
	public void push(int c)
	{ 
		if(top==null)
			top=new NodeInt(c);
		else
		{
		NodeInt temp=new NodeInt(c);
		temp.setNext(top);
		top=temp;
		}
	}
	
	public int pop()
	{ 
		if(top==null)
			return ' ';
		else
			{
			 int c = top.getData();
			 top=top.getNext();
			 return c;
			}
	}
	
	public int peep()
	{ 
		if(top==null)
			return ' ';
		else
			{
			 int c = top.getData();
			 return c;
			}
	}
	
}
