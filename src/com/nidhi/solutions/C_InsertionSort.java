package com.nidhi.solutions;

public class C_InsertionSort {
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
		for(int i=1;i<arraySize;i++)
		{
			int j=i-1;
			String insertElement =  theArray[i];
			while((j>=0)&&(Integer.parseInt(theArray[j])>Integer.parseInt(insertElement)))
			{
				theArray[j+1]=theArray[j];
				j--;
			}
			
			theArray[j+1]=insertElement;
		}
		//sorting ends
		return toString(theArray);
		
	}
}
