package com.nidhi.solutions;

public class I_AVLTreeSort {

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
		
	    AVLTree avlt = new AVLTree();
		
		//O(nlogn) sorting algorithm
		for(String element:theArray)
		avlt.insert(Integer.parseInt(element));
		theArray = avlt.inorder(theArray);
		
		return toString(theArray);
		//sorting ends
		
		
		
	}
	
}
