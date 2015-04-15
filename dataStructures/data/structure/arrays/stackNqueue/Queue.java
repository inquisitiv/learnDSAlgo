package data.structure.arrays.stackNqueue;

public class Queue<T> {

	int front;
	int rear;
	int capacity;
	int size;
	T[] arrayQueue;
	
	public int getcapacity() {
		return capacity;
	}
	public int getSize() {
		if(front==-1&&rear==-1)
			return 0;
		else if(front<=rear)
            return rear-front+1;
		else
			return capacity-(front-rear-1);
	}

	@SuppressWarnings("unchecked")
	public Queue(int capacity){
		
		front=-1;
		rear=-1;
		this.capacity=0;
		arrayQueue=null;
		if(capacity>0)
		{
		arrayQueue = (T[]) new Object[capacity];
		this.capacity = capacity;
		}
	}
		
	public void enQueue(T data)
	{
		if(front==-1&&rear==-1)
		{
			front++;
			rear++;
			arrayQueue[front]=data;
			return;
	    }
		else if(getSize()==capacity)
		{
			System.out.println("Error : Queue is full");
			return;
		}
		rear=(rear+1)%capacity;
		arrayQueue[rear]=data;
	}
	
	public T deQueue()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("Error : Queue is empty");
			return null;
		}
		if(front==rear)
		{
			T temp = arrayQueue[front];
			front=-1;
			rear=-1;
			return temp;
		}
		else
		{
			T temp = arrayQueue[front];
			front=(front+1)%capacity;
			return temp;
		}
	}
	
	public T peek()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("Error : Queue is empty");
			return null;
		}
		else
			return arrayQueue[front];
			
	}
	
	boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	
	
}
