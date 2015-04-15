package com.monika.revision;

public class G_HeapSort {

	public void swap(int[] array,int i,int j)
	{
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public void heapSort(int[] array)
	{
		int count = array.length;
		while(count>0)
		{
			swap(array,0,count-1);
			count--;
			percolateDown(array, count, 0);
		}
	}
	
	public void percolateDown(int[] array,int count, int i)
	{
		int max = i;
		if((2*i+1)<count)
		{
			if(array[2*i+1]>array[max])
				max=2*i+1;
		}
		if((2*i+2)<count)
		{
			if(array[2*i+2]>array[max])
				max=2*i+2;
		}
		if(max!=i)
		{
		swap(array,max,i);
		percolateDown(array,count,max);
		}
	}
	
	public void heapify(int[] array)
	{
		int count = array.length;
		for(int i=(count-2)/2;i>=0;i--)
		{
		  percolateDown(array,count,i);
		}
	}
	
	public void sort(int[] array)
	{
		heapify(array);
		heapSort(array);
	}
	
}
