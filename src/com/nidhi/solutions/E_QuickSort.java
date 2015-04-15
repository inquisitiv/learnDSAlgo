package com.nidhi.solutions;

// https://www.youtube.com/watch?v=vK_q-C-kXhs

public class E_QuickSort {
	
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
	
	public int partition(String[] theArray,int p,int q)
	{
		String pivot = theArray[p];
		int i=p;
		for(int j=p+1;j<=q;j++)
		{
		   if(Integer.parseInt(theArray[j])<=Integer.parseInt(pivot))
		   {
			   i=i+1;
			   swap(i,j,theArray);
		   }
		}
	    swap(p,i,theArray);
		return i;
	}
	
	public void quickSort(String[] theArray,int p,int q)
	{
		int index;
		if(p<q)
		{
		index = partition(theArray,p,q);
		quickSort(theArray,p,index-1);
		quickSort(theArray,index+1,q);
		}
	}
	
	public String sort(String arr)
	{
		String[] theArray = arr.split(" ");
		int arraySize = theArray.length;
		int p=0,q=arraySize-1;
		//O(nlogn) sorting algorithm
		quickSort(theArray,p,q);
		return toString(theArray);
		
	}
}
