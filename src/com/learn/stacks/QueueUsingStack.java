package com.learn.stacks;

public class QueueUsingStack {

	Stack s1 = new Stack();
	Stack s2 = new Stack();
	
	public void enQueue1(char x)
	{		
		while(s1.top!=null)
		{
			s2.push(s1.pop());
		}
		s1.push(x);
		while(s2.top!=null)
		{
			s1.push(s2.pop());
		}
	}
	
	public char deQueue1(char x)
	{		
		return s1.pop();
	}
	
	public void enQueue2(char x)
	{
		s1.push(x);
	}
	
	public char deQueue2()
	{		
		while(s1.top!=null)
			s2.push(s1.pop());
		char temp = s2.pop();
		while(s2.top!=null)
		s1.push(s2.pop());
		return temp;
	}
}
