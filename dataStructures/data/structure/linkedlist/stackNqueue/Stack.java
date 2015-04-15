package data.structure.linkedlist.stackNqueue;

import data.structure.nodes.LNode;

public class Stack<T> {
	

	LNode<T> top;
	int size;

	public int getSize() {
		return size;
	}
	
	public Stack()
	{
		top = null;
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void push(T data)
	{
		size++;
		if(top==null)
		{
			top=new LNode<T>(data);
			top.setNext(null);
		}
		else
		{
			LNode<T> temp = new LNode<T>(data);
			temp.setNext(top);
			top=temp;			
		}
	}

	public T pop()
	{
		if(top==null)
		{
		  System.out.println("stack is empty");
		  return null;
		}
		else
		{
		  size--;
		  T temp;
		  temp = top.getData();
		  top = top.getNext();
		  return temp;
		}
	}
	
	public T top()
	{
		return top.getData();
	}
	
	public void delete(){
		top=null;
		size=0;
	}
	
}
