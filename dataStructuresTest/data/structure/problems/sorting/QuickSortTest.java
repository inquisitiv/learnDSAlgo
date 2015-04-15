package data.structure.problems.sorting;

public class QuickSortTest {

	public static void main(String[] args) {
		
		QuickSort quickSort = new QuickSort();
		int[] array = new int[]{13,2,14,5,65,34,23,87,2,3,7,9};
		quickSort.sort(array);
		System.out.println();
		for(int ele : array)
		{
			System.out.print(ele+" < ");
		}
		System.out.println();
	}
	
}
