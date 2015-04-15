package com.nidhi.test;

import com.nidhi.solutions.A_BubbleSort;
import com.nidhi.solutions.B_SelectionSort;
import com.nidhi.solutions.C_InsertionSort;
import com.nidhi.solutions.D_ShellSort;
import com.nidhi.solutions.E_QuickSort;
import com.nidhi.solutions.F_MergeSort;
import com.nidhi.solutions.G_HeapSort;
import com.nidhi.solutions.H_TreeSort;
import com.nidhi.solutions.I_AVLTreeSort;

public class Test {
	
	public static void main(String args[])
	{
		A_BubbleSort bubbleSort = new A_BubbleSort();
		B_SelectionSort selectionSort = new B_SelectionSort();
		C_InsertionSort insertionSort = new C_InsertionSort();
		D_ShellSort shellSort = new D_ShellSort();
		E_QuickSort quickSort = new E_QuickSort();
		F_MergeSort mergedSort = new F_MergeSort();
		G_HeapSort heapSort = new G_HeapSort();
		H_TreeSort treeSort = new H_TreeSort();
		I_AVLTreeSort avlTreeSort = new I_AVLTreeSort();
		
    	//String array = "10 11 14 7 6 82 40 23 13 23 43 33 65 45 87 63 10 11 14 7 6 82 40 23 15 25 45 35 65 45 87 1 10 11 14 17 6 82 40 23 22 32";
		String array = "10 10 2 3 40 15 13 13 71 18 19 91";
		System.out.println("   Original Array   :"+ array);
		System.out.println("Bubble    Sorted Array :"+ bubbleSort.sort(array));
	    System.out.println("Selection Sorted Array :"+ selectionSort.sort(array)); 
	    System.out.println("Insertion Sorted Array :"+ insertionSort.sort(array)); 
	    System.out.println("Shell     Sorted Array :"+ shellSort.sort(array));
	    System.out.println("Quick     Sorted Array :"+ quickSort.sort(array));
	    System.out.println("Merge     Sorted Array :"+ mergedSort.sort(array));
	    System.out.println("Heap      Sorted Array :"+ heapSort.sort(array)); 
	    System.out.println("Tree      Sorted Array :"+ treeSort.sort(array)); 
	    System.out.println("AVL Tree  Sorted Array :"+ avlTreeSort.sort(array)); 

	}
}