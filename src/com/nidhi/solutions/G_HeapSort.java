package com.nidhi.solutions;

// referred http://faculty.simpson.edu/lydia.sinapova/www/cmsc250/LN250_Weiss/L13-HeapSortEx.htm

public class G_HeapSort {
	
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
	public void heapify(String[] theArray)
	{
		int count = theArray.length;
		for(int i=(count-1)/2;i>=0;i--)
		{
			percolateDown(i,count,theArray);
		}
	}
	
	public void percolateDown(int i,int count, String[] theArray)
	{
		int max = i;
		if(((2*i+1)<count)&&(theArray[2*i+1]!=null))
		{
		if(Integer.parseInt(theArray[max])<=Integer.parseInt(theArray[2*i+1]))
			max =2*i+1;
		}
		if(((2*i+2)<count)&&(theArray[2*i+2]!=null))
		{
		if(Integer.parseInt(theArray[max])<=Integer.parseInt(theArray[2*i+2]))
			max =2*i+2;
		}
		if(max!=i)
		{
		swap(max,i,theArray);
		percolateDown(max,count,theArray);
		}
		
	}
	public String sort(String arr)
	{
	    String[] theArray = arr.split(" ");
		int arraySize = theArray.length;
		int count = arraySize;
		
		//O(n) sorting algorithm
		
		//creating a max-heap
		heapify(theArray);
		
		//heap-sorting
		String temp;
		
		while(count>0)
		{	
		temp=theArray[count-1];
		theArray[count-1]=theArray[0];		
		theArray[0]=temp;
		count--;
		percolateDown(0,count,theArray);
		}
		//sorting ends
		
		return toString(theArray);
		
	}

}
