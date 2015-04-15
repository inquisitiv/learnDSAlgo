package com.nidhi.solutions;

public class B_SelectionSort {

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
		int min,pos;
		//O(n^2) sorting algorithm	
		for(int i=0;i<arraySize-1;i++)
		{
			min=Integer.parseInt(theArray[i]);
			pos=i;
			for(int j=i+1;j<arraySize;j++)
			{
				if(Integer.parseInt(theArray[j])<min)
				{
					min=Integer.parseInt(theArray[j]);
					pos=j;
				}
			}
			swap(i,pos,theArray);
			
		}
		//sorting ends
		return toString(theArray);
		
	}
}
