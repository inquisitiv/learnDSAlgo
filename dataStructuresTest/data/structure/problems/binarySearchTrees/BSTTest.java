package data.structure.problems.binarySearchTrees;

public class BSTTest {
	
	public static void main(String[] args) {
	
		BST bst = new BST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(2);
		bst.insert(17);
		bst.insert(0);
		bst.insert(16);
		bst.insert(6);
		
		bst.inorder();
		
	}
}
