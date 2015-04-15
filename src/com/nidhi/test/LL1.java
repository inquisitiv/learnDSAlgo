package com.nidhi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.nidhi.solutions.LinkedList;
import com.nidhi.solutions.LinkedListNode;

// nth node from end of linked list

public class LL1 {
	
	public static LinkedList createList(int n)
	{
		LinkedList items =  new LinkedList();
	    for(int i=1;i<=n;i++)
	    {
	    	items.insert(i);
	    }
		return items;
		
	}
	

	public static int calculateLength(LinkedListNode node)
	{
			if(node==null)
				return 0;
			else
			{
			  int count = 0;
			  while(node!=null)
			  {
				  count++;
				  node=node.getNext();
			  }
			  
			  return count;
			}
	}
	static int count = 0 ;
	public static void nthnodefromend(LinkedListNode start, int n)
	{
	    
		if(start==null)
		{
			return;
		}
		else
		{
		nthnodefromend(start.getNext(),n);
		count++;
		}
		if(count==n)
	    {
	    	System.out.println(start.getData()+" is the "+n+"th node from end");
	    	return;
	    }
		
	}
	//note: cannot use getLength
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		LinkedList list = createList(10);
		list.display();
		System.out.println("Enter the node no. from end you want to search");
		int n = scan.nextInt();
		LinkedListNode start = list.getHead();
		
		// using double scan O(n^2)
		/*
		int currentLength=calculateLength(start);
		if(currentLength<n)
		{
			System.out.println("list has less than "+n+" nodes");
			return;
		}
		while(currentLength>n)
		{
			start=start.getNext();
			currentLength=calculateLength(start);			
		}
		if(currentLength==n)
		{
			System.out.println(start.getData()+" is the "+n+"th node from end");
		}
		
		// using hashtable + O(n)
		start=list.getHead();

		Map hashTable = new HashMap<Integer,LinkedListNode>();
		int k=0;
		while(start!=null)
		{
			k++;
			hashTable.put(k, start);
			start=start.getNext();
		}
		
		System.out.println(((LinkedListNode) hashTable.get(list.getLength()-n+1)).getData()+" is the "+n+"th node from end");

		// without using hashtable + O(n)
		start=list.getHead();

		k=0;
		while(start!=null)
		{
			k++;
			start=start.getNext();
			
		}
		start=list.getHead();
        int pos = k-n+1;
        k=1;
		while(k<pos)
		{
			k++;
			start=start.getNext();
		}
		if(k==pos)
		System.out.println(start.getData()+" is the "+n+"th node from end");
		
		//with only one scan O(n) - EFFICIENT APPROACH
		start=list.getHead();
		LinkedListNode temp=start;
		int k=1;
		while(temp.getNext()!=null&&(k<n))
		{
			temp=temp.getNext();
			k++;
		}
	    if(temp.getNext()==null)
	    {
	    	if(k<n)
	    	System.out.println("not enough elements");
	    	else
	    	System.out.println(start.getData()+" is the "+n+"th node from end");
	    }
	    else
	    {
	    	while(temp.getNext()!=null)
	    	{
	    		start=start.getNext();
	    		temp=temp.getNext();
	    	}
	    	System.out.println(start.getData()+" is the "+n+"th node from end");
	    }
	    */
	    // using recursion space - O(n)	time - O(n)
	    nthnodefromend(list.getHead(),n);

	}

}
