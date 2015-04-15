package com.nidhi.solutions;

public class A_BubbleSort {
	
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
		int arraySize = theArray.length;
		
		//O(n^2) sorting algorithm
		
		for(int i=0;i<arraySize-1;i++)
		{
			for(int j=0;j<arraySize-i-1;j++)
			{
				if(Integer.parseInt(theArray[j])>Integer.parseInt(theArray[j+1]))
					swap(j,j+1,theArray);
			}
			
		}
		//sorting ends
		
		return toString(theArray);
		
	}

}
