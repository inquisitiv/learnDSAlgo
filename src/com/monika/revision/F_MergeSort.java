package com.monika.revision;

public class F_MergeSort {

	public void sort(int[] array)
	{
		int length = array.length;
		mergeSort(array,0,length-1);
	}
	
	public void mergeSort(int[] array,int low,int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			mergeSort(array,low,mid);
			mergeSort(array,mid+1,high);
			merge(low,mid,high,array);
		}
		
	}	
	
	public void merge(int low,int mid,int high,int[] array)
	{
		int n1 = mid-low+1;
		int n2 = high-mid;
		int[] array1 = new int[n1];
		int[] array2= new int[n2];
		int i=0,j=0,k;
		
		while(i<n1 && i<n2)
		{
			array1[i]=array[low+i];
			array2[i]=array[mid+1+i];
			i++;
		}
        
		while(i<n1)
		{
				array1[i]=array[low+i];
				i++;
	    }
		
		while(i<n2)
		{
				array1[i]=array[mid+1+i];
				i++;
		}
		
		i=0;
		k=0;
		
		while(i<n1 && j<n2)
		{
			if(array1[i]<array2[j])
			{
				array[low+k]=array1[i];
				k++;
				i++;				
			}
			else
			{
				array[low+k]=array2[j];
				k++;
				j++;				
			}
		}
        
		while(i<n1)
			{
				array[low+k]=array1[i];
				k++;
				i++;
			}
	    
		while(j<n2)
			{
				array[low+k]=array2[j];
				k++;
				j++;
			}
		
		
	}	
	
}
