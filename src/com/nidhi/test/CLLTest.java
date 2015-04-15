package com.nidhi.test;

import com.nidhi.solutions.CLL;

public class CLLTest {
	
	public static void main(String args[])
	{
		CLL list = new CLL();
		for(int i=1;i<=10;i++)
		{
			list.insert(i);
		    list.display();
		    System.out.println(list.getLength());
		}
		list.insert(15);
		list.display();
		System.out.println(list.getLength());
		list.insertAfter(5,50);
		list.display();
		System.out.println(list.getLength());
		
		 list.delete(6);
		 
		list.display();
		
		System.out.println(list.getLength());
		for(int i=1;i<=13;i++)
		{
			list.delete();
			list.display();
			System.out.println(list.getLength());
		}
		
	}

}
