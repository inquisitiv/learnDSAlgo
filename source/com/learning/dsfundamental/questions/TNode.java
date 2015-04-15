package com.learning.dsfundamental.questions;

public class TNode<Item> {

	Item data;
	TNode<Item> left;
	TNode<Item> right;
	
	public TNode(Item data) {
		
		this.data = data;
		left = null;
		right = null;
	}
	
}
