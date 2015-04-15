package com.learning.binarytrees;

public class LinkedListNode {

	Node data;
	public Node getData() {
		return data;
	}

	LinkedListNode next;
	
	public LinkedListNode(){
		data = null;
		next = null;
	}
	
	public LinkedListNode(Node data){
		this.data = data;
		next = null;
	}
	

	public void setData(Node data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
}
