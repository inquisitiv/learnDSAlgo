package com.learning.dsfundamental.questions;

public class Test {
	
	public static void main(String[] args) {
		
		SLL<Character> list = new SLL<Character>();
		list.insert('k');
		list.insert('e');
		list.insert('e');
		list.insert('p');
		/*
		list.insert(' ');
		list.insert('i');
		list.insert('t');
		list.insert(' ');
		list.insert('u');
		list.insert('p');
		list.insert('!');
		delete(list.findNode(' '));
		*/
		for(Character ele : list)
		{
			System.out.print(ele +" ");
		}
		
		System.out.println();
		
		list.start=reverse(list);
		
		for(Character ele : list)
		{
			System.out.print(ele +" ");
		}
		/*
		SLLtoBalancedTree<Character> sLLtoBalancedTree = new SLLtoBalancedTree<Character>();
		@SuppressWarnings("unused")
		TNode<Character> root = sLLtoBalancedTree.convert(list);
		System.out.println();
		
		DLL<Character> dlist = new DLL<Character>();
		dlist.insert('k');
		dlist.insert('e');
		dlist.insert('e');
		dlist.insert('p');
		dlist.insert(' ');
		dlist.insert('u');
		dlist.insert('p');
		dlist.insert('!');
		
		delete(dlist.findNode(' '));
		
		
		
		DLLtoBalancedTree<Character> dLLtoBalancedTree = new DLLtoBalancedTree<Character>();
		@SuppressWarnings("unused")
		TNode<Character> rootTree =dLLtoBalancedTree.convertInPlace(dlist);
		*/
	}
	
	public static void delete(LNode<Character> node){
		
		if(node.next!=null)
		{
			node.data = node.next.data;
			node.next = node.next.next;
		}
	}
	
   public static void delete(TNode<Character> node){
		
		if(node.right!=null)
		{
			node.data = node.right.data;
			node.right = node.right.right;
			node.right.left = node;
		}
		
	}
   
   public static LNode<Character> reverse(SLL<Character> list){
	   
	   LNode<Character> temp;
	   LNode<Character> prev=null;
	   LNode<Character> current=list.start;
	   while(current!=null)
	   {
		   temp=current.next;
		   current.next=prev;
		   prev=current;
		   current=temp;
	   }
	   return prev;
	}
   

}
