package com.nidhi.solutions;

public class H_TreeSort {
	
	public void swap(int i, int j,String[] array)
	{
		String temp = array[i];
		array[i]=array[j];
		array[j]=temp;		
	}
	public String toString(String[] array){

		String arrayOfNumbers="";
		for(String element : array)
		{
			arrayOfNumbers+=element+" ";
		}
		return arrayOfNumbers;	
		
	}
	
	public String sort(String arr)
	{
	    String[] theArray = arr.split(" ");
		
		BinarySearchTree bst = new BinarySearchTree();
		
		//O(nlogn) sorting algorithm
		for(String element:theArray)
		bst.insert(Integer.parseInt(element));
		theArray = bst.inorder(theArray);
		
		return toString(theArray);
		//sorting ends	
		
	}

}
