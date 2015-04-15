package com.nidhi.solutions;

public class D_ShellSort {
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
		int gap;
		// currently optimum increment size is 3x+1
		//for(gap=arraySize/4;gap>0;gap/=4)
		gap=1;
		while(gap<arraySize/3) gap = 3*gap + 1;

		while(gap>0)
		{
		for(int i=gap;i<arraySize;i+=1)
		{
			int j=i-gap;
			String insertElement =  theArray[i];
			while((j>=0)&&(Integer.parseInt(theArray[j])>Integer.parseInt(insertElement)))
			{
				theArray[j+gap]=theArray[j];
				j-=gap;
			}
			
			theArray[j+gap]=insertElement;
		}
		gap=gap/3;
		}
		//sorting ends
		return toString(theArray);
		
	}
}
