package com.learn.stacks;

public class NodeInt {
	
	int data;
	NodeInt next;
	
	public NodeInt(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	public void setData()
	{
		this.data = data;
	}

	public int getData()
	{
		return data;
	}
	
	public void setNext(NodeInt next)
	{
		this.next = next;
	}

	public NodeInt getNext()
	{
		return next;
	}

}
