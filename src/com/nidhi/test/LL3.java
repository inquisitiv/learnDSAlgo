package com.nidhi.test;

import java.util.Scanner;

import com.nidhi.solutions.LinkedList;
import com.nidhi.solutions.LinkedListNode;

public class LL3 {
	
	public static LinkedList createList(int n)
	{
		LinkedList items =  new LinkedList();
	    for(int i=1;i<=n;i++)
	    {
	    	items.insert(i);
	    }
		return items;
		
	}
	

	private static void reverseLinkedList(LinkedList list, LinkedListNode start) {
		
		if(start==null)
		{
			return;
		}
		if(start.getNext()==null)
		{
			list.setHead(start);
		}
	    else
	    {
	    	
	    	LinkedListNode temp = start.getNext();
	    	reverseLinkedList(list, temp);
	    	if(start==list.getHead())
	    	{
	    		temp.setNext(start);
	    		start.setNext(null);
	    	}
	    	else
	    	{
	    	 temp.setNext(start);
	    	}
	    	
	    }
	}

	private static void reverseInPairsUsingRecursion(LinkedList list,
			LinkedListNode start) {
			
		if(start==null || start.getNext()==null)
		{
			return;
		}
		if(start==list.getHead())
		{
			LinkedListNode temp = start.getNext();
			start.setNext(temp.getNext());
			temp.setNext(start);
			list.setHead(temp);
			reverseInPairsUsingRecursion(list, temp.getNext());
			return;
		}
		else if(start.getNext().getNext()!=null)
		{	
		  LinkedListNode temp = start.getNext();
		  start.setNext(temp.getNext());
		  temp.setNext(start.getNext().getNext());
		  start.getNext().setNext(temp);
		  reverseInPairsUsingRecursion(list, temp);
		}
	}
	
	public static void main(String args[])
	{
	    LinkedList list = createList(12);
		LinkedListNode start = list.getHead(); 
		list.display();
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value you want to insert");
		int data = scan.nextInt();
		//insert node in sorted linked list O(n)
		LinkedListNode prevNode = null;
	    while(start!=null && start.getData()<data) 
	    {
	    	prevNode=start;
	    	start=start.getNext();
	    }
	    if(prevNode!=null)
	    {
	    	LinkedListNode newNode = new LinkedListNode(data);
	    	newNode.setNext(prevNode.getNext());
	    	prevNode.setNext(newNode);
	    }
		list.display();
		*/
		//reverse a singly linked list O() - iterative
	    
		//reverse a singly linked list O() - recursion
		reverseLinkedList(list,list.getHead());
		list.display();
		
		//reverse linked list in pairs - iterative
		
		start = list.getHead();
		if(start!=null && start.getNext()!=null)
		{
		LinkedListNode temp = start.getNext();
		LinkedListNode prev = start;
		start.setNext(temp.getNext());
		temp.setNext(start);
		list.setHead(temp);	
		while(start.getNext()!=null && start.getNext().getNext()!=null)
		{
			  temp = start.getNext();
			  start.setNext(temp.getNext());
			  temp.setNext(start.getNext().getNext());
			  start.getNext().setNext(temp);
			  start=temp;
		}
		}
		list.display();
		
		//reverse linked list in pairs - recursive
		start = list.getHead();
		
		reverseInPairsUsingRecursion(list, start);
		
		list.display();
		
		// split circular linked list into two halves
		
		// check if linkedlist is palindrome
	
	}	

}
