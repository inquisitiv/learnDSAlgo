package com.nidhi.solutions;

public class LinkedList {
	
	LinkedListNode head;
	private int length;
	
	public LinkedList(LinkedListNode head)
	{
		this.head=head;
		if(head!=null)
			length=1;
	}

	public LinkedList() {
		
		head = null;
		length=0;
	}

	public void insert(int data)
	{
		LinkedListNode currentNode = head;
		if(currentNode==null)
		{
			head=new LinkedListNode(data);
		}
		else
		{
		while(currentNode.getNext()!=null)
			currentNode=currentNode.getNext();
		currentNode.setNext(new LinkedListNode(data));
		}
		length++;
	}
	public void insert(int data, int pos)
	{
		LinkedListNode newNode = new LinkedListNode(data);
		if(pos==1)
		{
			newNode.setNext(head);
			head=newNode;
			length++;
		}
		else
		{
			int count=1;
			LinkedListNode currentNode = head;
		while(count<(pos-1) && currentNode!=null)
		{
			currentNode=currentNode.getNext();
			count++;
		}
		if(count==(pos-1))
		{
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		length++;
		}
		else
		System.out.println("Invalid position");
	}

	}
	
	public void delete(int pos)
	{
			LinkedListNode currentNode = head;
			LinkedListNode temp;
			if(pos==1)
			{
				temp=head;
				head=temp.getNext();
				temp=null;
				length--;
			}
			else{
			int count = 1;
			while(count<(pos-1) && currentNode!=null)
			{
			count++;
			currentNode=currentNode.getNext();
			}
			if(count==(pos-1)&&currentNode!=null)
			{
				temp=currentNode.getNext();
				currentNode.setNext(temp.getNext());
				temp=null;
				length--;
			}
			else
				System.out.println("Invalid position");
			}
	}
	
	public void deleteList()
	{
			head=null;
			length=0;
	}
	
	public void display()
	{
	  LinkedListNode currentNode=head;
	  if(currentNode==null)
		  System.out.println("List is empty");
	  while(currentNode!=null)
	  {
		  System.out.print(currentNode.getData()+"-->");
		  currentNode=currentNode.getNext();
	  }
	  System.out.println();
	}
	
	public LinkedListNode getHead()
	{
		return head;
	}
	
	public void setHead(LinkedListNode newHead)
	{
		this.head=newHead;
	}
	
	public int getLength()
	{
		return length;
	}

}
