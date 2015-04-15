package data.structure.problems.sorting;

public class QuickSort {
	

	public void sort(int[] array)
	{
		quickSort(array,0,array.length-1);
	}	
	
	public void quickSort(int[] array, int low, int high)
	{
		
		if(high>low)
		{
		int pivot = array[low];
		int i=low;
        int temp;
		for(int j=i+1; j<=high;j++)
		{
			if(array[j]<=pivot)
			{
				i=i+1;
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		temp=array[i];
		array[i]=array[low];
		array[low]=temp;
		
		quickSort(array,low,i-1);
		quickSort(array,i+1,high);
		}
		
	}
	
}
