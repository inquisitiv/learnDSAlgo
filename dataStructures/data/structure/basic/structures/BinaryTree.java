package data.structure.basic.structures;

import data.structure.nodes.TNode;

public class BinaryTree<T> {

	TNode<T> root;
	
	public TNode<T> getRoot() {
		return root;
	}

	public void setRoot(TNode<T> root) {
		this.root = root;
	}
	
	public BinaryTree(){
		root = null;
	}
	
	public BinaryTree(TNode<T> root){
		this.root = root;
	}
	
}

