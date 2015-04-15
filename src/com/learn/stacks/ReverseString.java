package com.learn.stacks;

public class ReverseString {

	public String reverseString(String givenString)
	{
		Stack newStack = new Stack();
		
		int length = givenString.length();
		StringBuilder reverseString = new StringBuilder();
		for(int i=0;i<length;i++)
			newStack.push(givenString.charAt(i));
		while(newStack.top!=null)
			reverseString=reverseString.append(newStack.pop());
	    
		return reverseString.toString();
		
	}
	
}
