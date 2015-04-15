package com.monika.revision;

public class E_QuickSort {

	public void swap(int[] array,int i,int j)
	{
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public int partition(int[] array,int start, int end)
	{
		int pivot = start;
		int i=pivot;
		for(int j=pivot+1;j<=end;j++)
		{
			if(array[j]<=array[pivot])
			{
				i++;
				swap(array,i,j);
			}
		}
		swap(array,pivot,i);
		return i;
	}
	
	public void quickSort(int[] array, int i, int f)
	{
		int pivot;
		if(i<f)
		{
			pivot=partition(array,i,f);
			quickSort(array,i,pivot-1);
			quickSort(array,pivot+1,f);
		}
		
	}
	
	public void sort(int[] array)
	{
		int length = array.length;
	    
		quickSort(array,0,length-1);
	}
}
