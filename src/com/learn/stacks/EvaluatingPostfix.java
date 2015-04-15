package com.learn.stacks;

public class EvaluatingPostfix {

	public void evaluatingPostfix(String expression)
	{
		String[] exprsn = expression.split(" ");
		StackInt symbols = new StackInt();
		int temp;
		for(String c : exprsn)
		{
			switch(c)
			{
			case "+":temp=symbols.pop();
			         temp=symbols.pop()+temp;
				     symbols.push(temp);
					 break;
			case "-":temp=symbols.pop();
			         temp=symbols.pop()-temp;
				     symbols.push(temp);
					 break;
			case "*":temp=symbols.pop();
				     temp=(symbols.pop())*temp;
				     symbols.push(temp);
					 break;
			case "/":temp=symbols.pop();
			         temp=(symbols.pop())/temp;
				     symbols.push(temp);
					 break;
			case " ":break;
			default: symbols.push(Integer.parseInt(c));
			}
			
		}
		System.out.println("Result :"+symbols.pop());
	}
	
}
