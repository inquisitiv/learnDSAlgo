package com.learn.stacks;

public class StackUsingQueue {
	Queue q1 = new Queue();
	Queue q2 = new Queue();
	
   public void push1(char x)
   {
	   q2.enQueue(x);
	   while(!q1.isEmpty())
	   {
		  q2.enQueue(q1.deQueue());
	   }
	   Queue temp = q1;
	   q1=q2;
	   q2=temp;
   }
	
   public char pop1()
   {
	   return q1.deQueue();
   }
   
   public void push2(char x)
   {
	   q1.enQueue(x);
   }
	
   public char pop2()
   {
	  if(q1.isEmpty())
		  return ' ';
	  while(q1.front!=q1.rear)
		  q2.enQueue(q1.deQueue());
	  char ele = q1.deQueue();
	  Queue temp = q1;
      q1=q2;
      q2=temp;
	  return ele;
   }
   
   
}
