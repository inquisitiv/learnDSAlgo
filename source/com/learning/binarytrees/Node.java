package com.learning.binarytrees;

public class Node {

	int data;
	Node left;
	Node right;
	
	public Node(){
		this.data = Integer.MIN_VALUE;
		left = null;
		right = null;
	}
	public Node(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
}
