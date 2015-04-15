package com.learn.stacks;

public class NextGreatest {

	public void nextGreatest(int[] array)
	{
		StackInt stack = new StackInt();
		int length = array.length;
		stack.push(array[0]);
		for(int x=1;x<length;x++)
		{
		   if(array[x]>stack.peep())
		   {
			 while(stack.top!=null&&stack.peep()<array[x])
			   System.out.println(stack.pop()+"---> "+array[x]);
		   }
			 stack.push(array[x]);
		}
		while(stack.top!=null)
			   System.out.println(stack.pop()+"---> "+-1);	
	}
	
}
