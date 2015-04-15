package com.learn.stacks;

//https://algoriddles.wordpress.com/2012/04/03/reverse-a-stack-using-recursion/

public class ReverseStack {

	public void reverseStack(Stack given)
	{
		if(given.top==null)
		{
			return;
		}
		else
		{
			char temp = getLast(given);
			reverseStack(given);
			given.push(temp);
		}
	}
	
	public char getLast(Stack given)
	{
		char a = given.pop();
		if(given.top==null)
			return a;
		else
			{
			char k = getLast(given);
	        given.push(a);
	        return k;
			}
	}
	
}
