package com.nidhi.solutions;

public class DLLNode {

	private int data;
	private DLLNode previous;
	private DLLNode next;
	
	public DLLNode(int data)
	{
		this.data=data;
		this.previous=null;
		this.next=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	
	public void setPrevious(DLLNode previous)
	{
		this.previous=previous;
	}
	
	public void setNext(DLLNode next)
	{
		this.next=next;
	}
	
	public int getData()
	{
		return data;
	}
	
	public DLLNode getPrevious()
	{
		return previous;
	}
	
	public DLLNode getNext()
	{
		return next;
	}	
	
}
