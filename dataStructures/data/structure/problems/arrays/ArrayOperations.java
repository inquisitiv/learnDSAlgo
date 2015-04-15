package data.structure.problems.arrays;

import java.util.HashSet;

import data.structure.arrays.stackNqueue.Stack;
import data.structure.problems.sorting.QuickSort;

public class ArrayOperations {

	public void nextGreaterElement(int[] array)
	{
		Stack<Integer> stack = new Stack<Integer>(array.length);
		stack.push(array[0]);
		for(int i=1;i<array.length;i++)
		{
			if(!stack.isEmpty()&&array[i]>stack.top())
			{
				System.out.println(stack.pop() + " --> " + array[i]);
			}
			stack.push(array[i]);
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop() + " --> " +  -1);
		}
	}
	
	public void maximumDiff(int[] array)
	{
		int maxDiff=0;
		int canBeMin = array[0];
		int maximum = array[0];
		int currentMin=array[0];
		int flag=0;
		for(int i=1;i<array.length;i++)
		{
           if(array[i]-canBeMin>maxDiff) 
           {
        	   flag=1;
        	   maxDiff=array[i]-canBeMin;
        	   maximum = array[i];
        	   currentMin=canBeMin;
           }
           if(array[i]<canBeMin)
           {
        	   canBeMin=array[i];
           }
        }
        if(flag==1)
		System.out.println("Max diff is between " + currentMin +" and " +  maximum + " of " + maxDiff);
        else
        System.out.println("Numbers in decresing order");
	}
	
	public void pairForGivenDiff(int[] array, int diff)
	{
		QuickSort quickSort = new QuickSort();
		quickSort.sort(array);
		
		int i=0;
		int j=1;
		while(i<j && j<array.length)
		{
			if(Math.abs(array[j]-array[i])==diff)
			{
				System.out.println(array[i]+" "+array[j]+" form the given diff of "+diff);
				return;
			}
			else if(array[j]<0^array[i]<0)
			{
				if(array[j]-array[i]>diff)
					i++;
				else
					j++;
				
			}
			else
			{
				if(array[j]-array[i]<diff)
					j++;
				else
					i++;
			}
		    if(i==j)
		    	j=i+1;
		}
		System.out.println("No such pair");
		
	}
	
	public void searchInMatrix(int[][] matrix, int element,int m,int n)
	{
		int i = 0;
		int j = m-1;
		int flag=0;
		while(i<n && j>=0)
		{
			if(element==matrix[i][j])
			{
				flag=1;
				System.out.println(i+","+j);
				// if all wanted
				/*
				i++;
				if(i>=n)
				{
				break;
				}
				*/
			}
			if(element<matrix[i][j])
				j--;
			else
				i++;
		}
		if(flag==0)
			System.out.println("Element not present");
	}
	
	public void minDistance(int[] array,int m, int n)
	{
		int prev=-1;
		int flag=0;
		int diff=array.length;
		for(int i=0;i<array.length;i++)	
		{	
			if(flag==0)
			{
			if(array[i]==m || array[i]==n)
			{
				flag=1;
				prev = i; 
			}
			}
			if(array[i]==m || array[i]==n)
			{
				if(array[i]==array[prev])
				{
					prev=i;
				} 
				else
				{
				  if(Math.abs(i-prev)<diff)
				  {
					  diff=i-prev;
					  prev=i;
				  }
				}
			}
		}
		if(diff==array.length)
			System.out.println("Numbers not present");
		else
			System.out.println("Minimum difference is "+diff);
	}
	
	public int countInversion(int[] array)
	{
		return countInversionUsingMerge(array,0,array.length-1);
	}
	
	public int countInversionUsingMerge(int[] array,int low,int high)
	{
		if(high>low)
		{
			int mid = low + (high-low)/2;
			int left =  countInversionUsingMerge(array,low,mid);
			int right = countInversionUsingMerge(array,mid+1,high);
			int invMerge = merge(array,low,mid+1,high);
			return left+right+invMerge;
		}
		else
		return 0;
	}

	private int merge(int[] array, int low, int mid, int high)
	{
		int i = low;
		int j = mid;
		int invMerge = 0;
		int k=0;
		int[] mergeArray = new int[high-low+1];
		while(i<mid && j<=high)
		{
			if(array[i]<=array[j])
			{
				mergeArray[k]=array[i];
				i++;
				k++;
			}
			else if(array[i]>array[j])
			{
				mergeArray[k]=array[j];
				invMerge = invMerge+mid-i;
				j++;
				k++;
			}
		}
		while(i<mid)
		{
			mergeArray[k]=array[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			mergeArray[k]=array[j];
			j++;
			k++;
		}
		k=low;
		for(int ele : mergeArray)
		{
			array[k]=ele;
			k++;
		}
		return invMerge;
	}
	
	public boolean duplicatesWithKBruteForce(int[] array, int k)
	{
		int len = array.length;
		if(k>=len)
		{
			System.out.println("Invalid distance");
			return false;
	    } 
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=i+k && j<len;j++)
			{
				if(array[i]==array[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public boolean duplicatesWithK(int[] array, int k)
	{
		int len = array.length;
		if(k>=len)
		{
			System.out.println("Invalid distance");
			return false;
	    } 
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i=0;i<len;i++)
		{
			if(!hashset.contains(array[i]))
			{
				return true;
			}
			else
			hashset.add(array[i]);
			if(k>=i)
			hashset.remove(array[k-i]);	
		}
		return false;
	}
	
	public float medianOfSortedArrays(int[] array1,int[] array2)
	{
	    return medianOfSortedArrays(array1,array2,0,array1.length-1,0,array2.length-1);
	}
	
	public float medianOfSortedArrays(int[] array1,int[] array2,int l1,int h1, int l2, int h2)
	{
		
         int array1len = h1-l1+1;
         int array2len = h2-l2+1;
         while(array1len>2 || array2len>2)
 		{
         int median1pos = ((array1len-1)>>1) + l1;
		 int median2pos = ((array2len-1)>>1) + l2;
		 int median1, median2;
         if(array1len%2==0)
         {
        	 median1 = (array1[median1pos]>>1)+(array1[median1pos+1]>>1);
			 median1pos++;
         }
         else
        	 median1 = array1[median1pos];
         if(array2len%2==0)
         {
        	 median2 = (array2[median2pos]>>1)+(array2[median2pos+1]>>1);
			 median2pos++;
         }
         else
        	 median2 = array2[median2pos];
        	 
         if(median1==median2)
        	 return median1;
         else if(median1<median2)
             return medianOfSortedArrays(array1,array2,median1pos+1,array1len-1+l1,0,median2pos-1);
         else if(median1>median2)
             return medianOfSortedArrays(array1,array2, median2pos+1,array2len-1+l1,0,median1pos-1);
	   }
         return (max(array1[l1], array2[l2]) + min(array1[h1], array2[h2]))/2;
	}
	
	public int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	public int min(int a, int b)
	{
		return a<b?a:b;
	}
}
