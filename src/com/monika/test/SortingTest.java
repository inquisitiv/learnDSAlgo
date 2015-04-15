package com.monika.test;

import com.monika.revision.A_BubbleSort;
import com.monika.revision.B_SelectionSort;
import com.monika.revision.C_InsertionSort;
import com.monika.revision.D_ShellSort;
import com.monika.revision.E_QuickSort;
import com.monika.revision.F_MergeSort;
import com.monika.revision.G_HeapSort;
import com.monika.revision.H_TreeSort;

public class SortingTest {

	public static void display(int args[])
	{
		for(int element : args)
			System.out.print(element+ " ");
		System.out.println();
	}
	
	public static void main(String args[])
	{
	    int[] array;
	    
	    array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
	    System.out.print("Original      Array :");
	    //display(array);
		A_BubbleSort bubbleSort = new A_BubbleSort();
	    bubbleSort.sort(array);
	    System.out.print("Bubble Sorted Array :");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
		B_SelectionSort selectionSort = new B_SelectionSort();
		selectionSort.sort(array);
		System.out.print("SelectionSortedArray:");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
		C_InsertionSort insertionSort = new C_InsertionSort();
		insertionSort.sort(array);
		System.out.print("InsertionSortedArray:");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
		D_ShellSort shellSort = new D_ShellSort();
		shellSort.sort(array);
		System.out.print("ShellSorted    Array:");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
	    E_QuickSort quickSort = new E_QuickSort();
		quickSort.sort(array);
		System.out.print("QuickSorted    Array:");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
	    F_MergeSort mergeSort = new F_MergeSort();
	    mergeSort.sort(array);
		System.out.print("MergeSorted    Array:");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
	    G_HeapSort heapSort = new G_HeapSort();
	    heapSort.sort(array);
		System.out.print("Heap Sorted    Array :");
		display(array);
		
		array = new int[]{10,10,2,3,40,15,13,13,71,18,19,91};
		System.out.print("Original      Array :");
	    //display(array);
	    H_TreeSort treeSort = new H_TreeSort();
		System.out.print("Tree Sorted    Array :");
	    treeSort.sort(array);
	}
	
}
