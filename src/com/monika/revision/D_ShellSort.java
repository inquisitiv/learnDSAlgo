package com.monika.revision;

/*
 * notes on increment size:
 * powers of 2 (1,2,4,8) not a good idea since you will 
 * miss on comparing odd with even places until 1 sorted
 * 
 * shell's idea: try powers of 2 minus 1 (1,3,7,15)
 * 
 * kunuth's idea: x=3x+1 (1,4,13,40..) easy to compute
 * 
 * 
 * */


public class D_ShellSort {
	
	public void sort(int[] array)
	{
		int length = array.length;
		
		//O(n^2)
		int i,j,element;
		int gap=1;
		while(3*gap<length) gap = 3*gap+1;
		while(gap>0)
		{
		for(i=gap;i<length;i++)
		{		
			element=array[i];
			for(j=i-gap;j>=0&&array[j]>element;array[j+gap]=array[j],j=j-gap);
			array[j+gap]=element;
		}
		gap=(gap-1)/3;
		}
	}	

}
