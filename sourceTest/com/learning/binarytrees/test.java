package com.learning.binarytrees;

public class test {
	public static void main(String args[]){
		BinaryTreeOperation objectOperation = new BinaryTreeOperation();
		Node root = new Node(40);
		objectOperation.insertElement(root, 20);
		objectOperation.insertElement(root, 25);
		objectOperation.insertElement(root, 4);
		objectOperation.insertElement(root, 16);
		objectOperation.insertElement(root, 0);
		objectOperation.insertElement(root, 50);
		root.left.left.left = new Node (15);
		/*
		objectOperation.insertElement(root, 2);
		objectOperation.insertElement(root, 3);
		objectOperation.insertElement(root, 4);
		objectOperation.insertElement(root, 5);
		objectOperation.insertElement(root, 6);
		objectOperation.insertElement(root, 7);
		objectOperation.insertElement(root, 8);
		//objectOperation.insertElement(root, 9);
		//objectOperation.insertElement(root, 10);
		 * 
		 */
		
		objectOperation.levelOrderTraversal(root);
		System.out.print("\n-----------------------\n");
		/*
		objectOperation.postOrderRecur(root);
		System.out.println();
		
		objectOperation.postOrderNonRecur(root);
		System.out.println();
		objectOperation.postOrderNonRecurEasy(root);
		System.out.print("\n-----------------------\n");
		
		objectOperation.inOrderRecur(root);
		System.out.println();
		
		objectOperation.inOrderNonRecur(root);
		System.out.println();
		
		objectOperation.inOrderNonRecurEasy(root);
		System.out.print("\n-----------------------\n");
		objectOperation.preOrderRecur(root);
		System.out.println();
		objectOperation.preOrderNonRecur(root);
		System.out.println();
		
		objectOperation.preOrderNonRecurEasy(root);
		System.out.print("\n-----------------------\n");
		
		System.out.print("root : " + objectOperation.size(root));
		System.out.print("\n-----------------------\n");
		
		System.out.print("size : " + objectOperation.size(root));
		System.out.print("\n-----------------------\n");
		
		System.out.print("height : " + objectOperation.maxHeight(root));
		System.out.print("\n-----------------------\n");
		
		root = objectOperation.delete(root);
		System.out.print("\n-----------------------\n");
		*/
		Node MirrorTreeRoot = objectOperation.mirror(root);
		objectOperation.levelOrderTraversal(MirrorTreeRoot);
		System.out.println("\n-----------------------\n");
		
		objectOperation.inOrderRecur(root);
		System.out.println();
		
		objectOperation.leafNodePaths(root);
		System.out.print("-------------------------------\n");
		
		int leafNodes = objectOperation.noOfleafNodes(root);
		System.out.print("Number of leafnodes : " + leafNodes);
		System.out.print("\n-------------------------------\n");
	
		int noOfHalfNodes = objectOperation.noOfHalfNodes(root);
		System.out.print("Number of leafnodes : " + noOfHalfNodes);
		System.out.print("\n-------------------------------\n");
		//objectOperation.inOrderRecur(root);
		//System.out.println();
		
		objectOperation.levelOrderSpiral(root);
		System.out.print("\n-------------------------------\n");
		
		System.out.print("Is Sum Tree : " + objectOperation.isSumTree(root));
		System.out.print("\n-------------------------------\n");
		
		System.out.print("Max Width of tree : " + objectOperation.maxWidthUsingLevelOrder(root));
		System.out.print("\n-------------------------------\n");
		
		objectOperation.printAncestors(root, 40);
		System.out.print("\n-------------------------------\n");
		
		System.out.println("LCA :" + objectOperation.lca(root,16,15).data);
		System.out.print("\n-------------------------------\n");
	}

}
