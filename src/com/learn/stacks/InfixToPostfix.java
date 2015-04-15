package com.learn.stacks;

public class InfixToPostfix {
	
	public void infixToPostfix(String expression)
	{
	
		char[] exprsn = expression.toCharArray();
		Stack symbols = new Stack();
		char temp;
		for(char c : exprsn)
		{
			switch(c)
			{
			case '+' :    
			case '-' :    temp=symbols.pop();
				      	  while(temp!='(' &&temp!='{' &&temp!='[' &&temp!=' ' )
				      	  {
				      		  System.out.print(temp);
				      		  temp=symbols.pop();
				      	  }
				      	  if(temp!=' ')
				      		  symbols.push(temp);
				      	  symbols.push(c);
				      	  break;
			case '*' :   
			case '/' :    temp=symbols.pop();
				      	  while(temp!='(' &&temp!='{' &&temp!='[' &&temp!='+' &&temp!='-' &&temp!=' ' )
				      	  {
				      		  System.out.print(temp);
				      		  temp=symbols.pop();
				      	  }
				      	  if(temp!=' ')
				      		  symbols.push(temp);
				      	  symbols.push(c);
				      	  break;
			case ')' :    temp=symbols.pop();
				      	  while(temp!='(')
				      	  {
				      		  System.out.print(temp);
				      		  temp=symbols.pop();
				      	  }
				      	  break;
			case ']' :temp=symbols.pop();
			      	  while(temp!='[')
			      	  {
			      		  System.out.print(temp);
			      		  temp=symbols.pop();
			      	  }
			      	  break;
			case '}' : temp=symbols.pop();
			      	  while(temp!='{')
			      	  {
			      		  System.out.print(temp);
			      		  temp=symbols.pop();
			      	  }
			      	  break;
			case '(':
			case '{':
			case '[': symbols.push(c);
			          break;
			default: System.out.print(c);
		   }
		}
		while(symbols.top!=null)
           System.out.print(symbols.pop());
	}
		
	}

