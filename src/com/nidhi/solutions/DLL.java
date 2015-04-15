package com.nidhi.solutions;

public class DLL {
	
	private DLLNode head;
	private DLLNode tail;
	private int length;
	
	public DLL()
	{
		head=null;
		tail=null;
		length=0;
	}
	
	public DLL(int data)
	{
		head=new DLLNode(data);
		tail=head;
		length=1;
	}

	public int getLength()
	{
		return length;
	}
	
	public void insert(int data)
	{
		insert(data, length+1);
	}
	
	public void insert(int data, int position)
	{
		if(position<1)
			position = 1;
		else if (position>(length+1))
			position=length+1;
		if(position == 1)
		{
			if(head==null)
			{
				head = new DLLNode(data);
				tail=head;
				length++;
			}
			else
			{
				DLLNode newNode = new DLLNode(data);
				newNode.setNext(head);
				head.setPrevious(newNode);
				head=newNode;
				length++;
			}
		}
		else if(position==length+1)
		{
			DLLNode newNode = new DLLNode(data);
			newNode.setNext(null);
			newNode.setPrevious(tail);
			tail.setNext(newNode);
            tail=newNode;
            length++;
		}
		else
		{
			DLLNode p;
			int count = 1;
			for(p=head;p!=null;p=p.getNext())
			{
				if(count==(position-1))
				{
					DLLNode newNode = new DLLNode(data);
					newNode.setPrevious(p);
					newNode.setNext(p.getNext());
					p.setNext(newNode);
					length++;
					break;
				}
				else 
				count++;
			}
			
		}
	}
	
	public void delete()
	{
		delete(length);
	}
	
	public void delete(int pos)
	{
		if(pos<1)
		 pos=1;
		else if(pos>length)
		 pos=length;
		if(head==null)
		{
			return;
		}
		else
		{
			if(pos==1)
			{
				if(head.getNext()==null)
				{
					head=null;
					length=0;
				}
				else
				{
					DLLNode temp = head;
					head=head.getNext();
					head.setPrevious(null);
					temp=null;
					length--;
				}
			}
			else if(pos==length)
			{
				DLLNode temp = tail;
				tail=tail.getPrevious();
				tail.setNext(null);
				temp=null;
				length--;
			}
			else
			{
				DLLNode p;
				int count=1;
				for(p=head;p.getNext()!=null;p=p.getNext())
				{
					if(count==(pos-1))
					{
                        DLLNode temp=p.getNext();
						p.setNext(temp.getNext());
						if(temp.getNext()!=null)
						temp.getNext().setPrevious(p);
						temp=null;
						length--;
						break;
					}
					else
						count++;
				}
				
			}
			
		}
	}
	
	public void clearList()
	{
		head=null;
		tail=null;
		length=0;
	}
	
	
	public void display()
	{
		if(head==null)
			System.out.println("DLL is empty");
		else
		{
		for(DLLNode p=head;p!=null;System.out.print(p.getData()+"-->"),p=p.getNext());
		System.out.println();
		}
	}


}
