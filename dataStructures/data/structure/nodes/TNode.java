package data.structure.nodes;

public class TNode<T> {

	T data;
	TNode<T> left;
	TNode<T> right;
	
	public TNode(T data) {
		
		this.data = data;
		left = null;
		right = null;
	}
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public TNode<T> getLeft() {
		return left;
	}

	public void setLeft(TNode<T> left) {
		this.left = left;
	}

	public TNode<T> getRight() {
		return right;
	}

	public void setRight(TNode<T> right) {
		this.right = right;
	}
	
}