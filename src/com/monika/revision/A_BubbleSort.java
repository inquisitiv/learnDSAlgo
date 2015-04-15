package com.monika.revision;

public class A_BubbleSort {
	
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
		
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-i-1;j++)
			{
				if(array[j]>array[j+1])
					swap(array,j,j+1);
			}
		}
	}

}
