package com.learn.stacks;

public class ReverseStackTest {

	public static void main(String args[])
	{
		ReverseStack object = new ReverseStack();
		Stack myStack = new Stack();
		myStack.push('*');
		myStack.push('a');
		myStack.push('e');
		myStack.push('i');
		myStack.push('o');
		myStack.push('u');
		myStack.push('*');
		object.reverseStack(myStack);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}
	
}
