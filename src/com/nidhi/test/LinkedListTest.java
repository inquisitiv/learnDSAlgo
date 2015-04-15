package com.nidhi.test;


import com.nidhi.solutions.LinkedList;

public class LinkedListTest {
	
	public static void main(String args[])
	{
	LinkedList items =  new LinkedList();
    for(int i=1;i<6;i++)
    {
    	items.insert(i);
    }
	items.display();
	items.insert(4, 0);
	items.display();
	items.deleteList();
    items.display();
    items.delete(2);
    items.display();
    items.deleteList();
    items.display();
    System.out.println();
	}

}
