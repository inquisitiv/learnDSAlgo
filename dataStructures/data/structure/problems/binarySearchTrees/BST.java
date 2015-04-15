package data.structure.problems.binarySearchTrees;

import com.learn.bsts.Node;

import data.structure.nodes.TNode;

public class BST {


	TNode<Integer> root;
	
	public TNode<Integer> getRoot() {
		return root;
	}

	public void setRoot(TNode<Integer> root) {
		this.root = root;
	}

	public BST()
	{
		this.root=null;
	}
	
	public BST(TNode<Integer> root)
	{
		this.root=root;
	}
	
	public void insert(int data)
	{
		if(root == null)
		{
			root = new TNode<Integer>(data);
			return;
		}
		insert(root,data);
	}
	
	public void insert(TNode<Integer> node, int data)
	{
		if(data<node.getData())
		{
			if(node.getLeft()==null)
		    node.setLeft(new TNode<Integer>(data));
			else
			insert(node.getLeft(), data);
		}
		else if(data>node.getData())
		{
			if(node.getRight()==null)
			node.setRight(new TNode<Integer>(data));
			else
			insert(node.getRight(), data);
		}
	}
	
	
	public void inorder()
	{
		System.out.println();
		inorder(root);
	}
	
	public void inorder(TNode<Integer> temp)
	{
		if(temp!=null)
		{
		inorder(temp.getLeft());
		System.out.print(temp.getData()+" ");
		inorder(temp.getRight());
		}
	}
	
	public void delete(int element)
	{
		if(root.getData()==element)
			root=null;
		else
			delete(root,element);
	}
	
	public TNode<Integer> delete(TNode<Integer> node,int element)
	{
		if(element<node.getData())
			delete(node.getLeft(),element);
		else if(element>node.getData())
			delete(node.getRight(),element);
		else if(element==node.getData())
			node = delete(node.getLeft(),element);
	}
	
}
