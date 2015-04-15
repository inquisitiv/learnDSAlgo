package com.learning.dsfundamental.questions;

public class LNode<Item> {

	Item data;
	LNode<Item> next;
	
	public LNode(Item data){
		
		this.data = data;
		next = null;
	}
	
}
