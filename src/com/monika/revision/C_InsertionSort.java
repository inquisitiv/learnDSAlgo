package com.monika.revision;

public class C_InsertionSort {

	public void swap(int[] array,int i,int j)
	{
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public void sort(int[] array)
	{
		int length = array.length;
		
		//O(n^2)
		int i,j,element;
		for(i=1;i<length;i++)
		{		
			element=array[i];
			for(j=i-1;j>=0&&array[j]>element;array[j+1]=array[j],j--);
			array[j+1]=element;
		}
	}
	
}
