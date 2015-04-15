package data.structure.problems.sorting;

import java.util.Arrays;

public class CountingSort {

	public int[] sort(int[] array, int min, int max)
	{
		int rangeLen = max-min+1;
		int[] range = new int[rangeLen];
		int[] outputArray = new int[array.length];
		Arrays.fill(range, 0);
		for(int i=0; i<array.length; i++)
		{
		   	range[array[i]-min]++;
		}
		for(int i=1; i<rangeLen; i++)
		{
		   	range[i] = range[i]+range[i-1];
		}
		int count;
		for(int i=0; i<rangeLen; i++)
		{
			if(i==0)
			{
			count = range[i];
			}
			else
			count = range[i]-range[i-1];
			int k = 1;
			while(count!=0)
			{
			  outputArray[range[i]-k]=i+min;
			  count--;
			  k++;
			}
		}
		return outputArray;
	}
}
