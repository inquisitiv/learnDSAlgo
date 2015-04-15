package com.nidhi.test;

import com.nidhi.solutions.DLL;

public class DLLTest {
	
	public static void main(String args[])
	{
		DLL list = new DLL();
		for(int i=1;i<=10;i++)
		{
			list.insert(i);
			list.display();
			System.out.println(list.getLength());
		}
		list.insert(15,11);
		list.display();
		System.out.println(list.getLength());
		list.delete(11);
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
