package com.learn.stacks;

public class StackUsingQueueTest {

	public static void main(String args[])
	{
		StackUsingQueue myStack = new StackUsingQueue();
		myStack.push2('*');
		myStack.push2('a');
		myStack.push2('b');
		myStack.push2('c');
		myStack.push2('d');
		myStack.push2('e');
		myStack.push2('*');
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		System.out.println(myStack.pop2());
		/*
		Queue myQueue = new Queue();
		myQueue.enQueue('a');
		myQueue.enQueue('e');
		myQueue.enQueue('i');
		myQueue.enQueue('o');
		myQueue.enQueue('o');
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.deQueue());
		*/
	}
	
}
