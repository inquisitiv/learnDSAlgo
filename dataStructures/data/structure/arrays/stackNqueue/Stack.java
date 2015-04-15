package data.structure.arrays.stackNqueue;

public class Stack<T> {
	
	int top;
	T[] arrayStack;
	int capacity;
	int size;
	
	public int getcapacity() {
		return capacity;
	}
	
	public int getSize() {
		return top+1;
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int capacity)
	{
		top=-1;
		arrayStack = null;
		this.capacity=0;
		if(capacity>0)
		{
		arrayStack = (T[]) new Object[capacity];
		this.capacity = capacity;
		}
	}
	
	public void push(T data)
	{
		if(top<arrayStack.length-1)
		{
			top++;
			arrayStack[top]=data;
		}
		else
		{
			System.out.println("Error : Stack is full!");
		    return;
		}
	}
	
	public T pop()
	{
		if(top==-1)
		{
			System.out.println("Error : Stack is empty!");
			return null;
		}
		else
		{
			T temp = arrayStack[top];
			top=top-1;
			return temp;
		}
	}
	
	public T top()
	{
		if(top==-1)
			return null;
		else
			return arrayStack[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}

}
