package data.structure.problems.arrays;

public class ArrayOperationsTest {

	public static void main(String[] args) {
		
		ArrayOperations operate = new ArrayOperations();
		//operate.nextGreaterElement(new int[]{4,5,2,2,15});
		//operate.maximumDiff(new int[]{4,-5,2,0,1,2});
		//operate.pairForGivenDiff(new int[]{-4,-5,2,0,1,2}, 1);
		
		int[][] matrix = new int[][]{{1,2,3,4,5,6,7,8,9},{2,3,4,5,6,7,8,9,10},{3,4,5,6,7,8,9,10,11},{4,5,6,7,8,9,10,11,12},{5,9,10,11,18,19,21,22,24}};
		
		operate.searchInMatrix(matrix,9,9,5);
		operate.minDistance(new int[]{3, 5, 4, 2, 6, 5, 6, 6, 6, 4, 8, 3}, 3, 6);
		System.out.println("Inversion number : "+operate.countInversion(new int[]{1,0,-1,-2,-3,-4}));
		System.out.println("Has duplicates within k : " + operate.duplicatesWithKBruteForce(new int[]{1,0,-1,8,-3,-4}, 10));
		System.out.println("Has duplicates within k : " + operate.duplicatesWithKBruteForce(new int[]{1,0,-1,8,9,-1}, 5));
		//System.out.println(operate.medianOfSortedArrays(new int[]{1,2,3,4,5,6,7,8,9},new int[]{5,9,10,11,18,19,21,22,24}));
		System.out.println(operate.medianOfSortedArrays(new int[]{0,1,2},new int[]{3,4,5,7,12,13,14,15}));
	}
}
