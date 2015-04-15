package com.nidhi.solutions;

public class LinkedListNode {

   private
    	int data;
		LinkedListNode next;
		
   public LinkedListNode(int data)
   {
	   this.data=data;
	   this.next=null;	   
   }
	
   public void setData(int data)
   {
	   this.data=data;
   }
   
   public int getData()
   {
	   return data;
   }
	
   public void setNext(LinkedListNode next)
   {
	   this.next=next;
   }
   
   public LinkedListNode getNext()
   {
	   return this.next;
   }
	
}
