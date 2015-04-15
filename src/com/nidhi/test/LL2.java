package com.nidhi.test;

import java.util.HashMap;
import java.util.Map;

import com.nidhi.solutions.CLL;
import com.nidhi.solutions.LinkedList;
import com.nidhi.solutions.LinkedListNode;

//null terminated or ends in a cycle

public class LL2 {
	
	public static CLL createCircularList(int n, int startfrom)
	{
		CLL items =  new CLL();
		if(n==0)
			return null;
	    for(int i=1;i<=n;i++)
	    {
	    	items.insert(i+startfrom);
	    }
		return items;
		
	}	

	public static LinkedList createList(int n)
	{
		LinkedList items =  new LinkedList();
	    for(int i=1;i<=n;i++)
	    {
	    	items.insert(i);
	    }
	    LinkedListNode temp = items.getHead();
	    CLL loop = createCircularList(3,n);
	    if(loop!=null)
	    {
	    if(temp!=null)
	    {
        LinkedListNode startLoop = loop.getTail().getNext();
	    while(temp.getNext()!=null) temp=temp.getNext();
	    temp.setNext(startLoop);
	    }
	    else
	    items.setHead(loop.getTail());
	    }
	    return items;
		
		
	}	
	
	public static void main(String args[])
	{
		LinkedList list = createList(4);
		LinkedListNode start = list.getHead();
		
		//bruteforce O(n^2)
		/*
		LinkedListNode temp1, temp2;
		LinkedListNode address1, address2;
		if(start==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			 address1= start.getNext();
			 temp=start.getNext();
			 //difficult to find end of loop	
		}
	   */
		//using hashmap O(n) each
        /*
		Map hashTable = new HashMap<Integer,LinkedListNode>();
		int k=0;
		LinkedListNode inTable;
		int key=0;
		if(start==null)
		{
			System.out.println("No list present");
			return;
		}
		while(start!=null)
		{
		     for(int i = 1;i<=key;i++)
		     {
		    	 if(start==hashTable.get(i))
		    	 {
		    		 System.out.println("Loop is present");
		    		 return;
		    	 }
		     }
		    key++;
			hashTable.put(key,start);
			start=start.getNext();
		}
		
		if(start==null)
			System.out.println("No loop present");
		*/
		start = list.getHead();
	
		
		// sorting technique algo fails because : cant find end of loop, can't store it in array
		
		// space - O(1) time - O(n) -  Floyd cycle finding algorithm - EFFICIENT APPROACH
		
		LinkedListNode slowPtr=start;
		LinkedListNode fastPtr=start;
		do
		{
			slowPtr=slowPtr.getNext();
			fastPtr=fastPtr.getNext().getNext();
			
		} while(fastPtr!=null && fastPtr.getNext()!=null && slowPtr!=null && slowPtr != fastPtr);
		
		if(slowPtr==null || fastPtr==null || fastPtr.getNext()==null)
		{
			System.out.println("--No loop present--");
		}
		else
		{
			System.out.println("--Loop is present--");
			//finding the start of the loop - using the extension for floyd
			slowPtr=start;
			while(slowPtr!=fastPtr)
			{
				slowPtr=slowPtr.getNext();
				fastPtr=fastPtr.getNext();
			}
			System.out.println(slowPtr.getData()+" is the start of the node");
			//finding the length of the loop - using the extension for floyd
			int length=0;
			do
			{
				length++;
				slowPtr=slowPtr.getNext();
				
			}while(slowPtr!=fastPtr);
			
			System.out.println(length+" is the length of the loop in the list");
		}		
		
	}	
	
}
