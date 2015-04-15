package com.nidhi.solutions;

public class F_MergeSort {
	
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
		//O(nlogn) sorting algorithm
		mergeSort(0,arraySize-1,theArray);
		//sorting ends
		return toString(theArray);
		
	}
	
	public void mergeSort(int low, int high, String[] array)
	{
		if(low<high)
		{
		int mid = low + (high-low)/2;
		mergeSort(low,mid,array);
		mergeSort(mid+1,high,array);
		merge(low,mid,high,array);
		}
		
	}	

	void merge(int l, int m, int r,String arr[])
		{
		  int i,j,k;
		  int n1 = m-l+1;
		  int n2 = r-m;
		  String[] L = new String[n1];
		  String[] R = new String[n2];
		  for(i=0;i<n1;i++)
		  {
			  L[i]=arr[l+i];
		  }
		  for(i=0;i<n2;i++)
		  {
			  R[i]=arr[m+1+i];
		  }
		  i=0;
		  j=0;
		  k=l;
		  while((i<n1)&&(j<n2))
		  {
			  if(Integer.parseInt(L[i])<=Integer.parseInt(R[j]))
			  {
				  arr[k]=L[i];
				  k++;
				  i++;
			  }
			  else
			  {
				  arr[k]=R[j];
				  k++;
				  j++;
			  }
		  }
		  
		  while(i<n1)
		  {
			  arr[k]=L[i];
			  k++;
			  i++;
		  }
		  while(j<n2)
		  {
			  arr[k]=R[j];
			  k++;
			  j++;
		  }
		  
		}
		
	}
