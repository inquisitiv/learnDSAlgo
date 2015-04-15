package com.monika.revision;

public class B_SelectionSort {

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
		int min,pos_min;
		for(int i=0;i<length-1;i++)
		{
		    min=array[i];
		    pos_min=i;
			for(int j=i+1;j<length;j++)
			{
				if(min>array[j])
				{
					min=array[j];
					pos_min=j;
				}
			}
			swap(array,i,pos_min);
		}
	}
	
}
