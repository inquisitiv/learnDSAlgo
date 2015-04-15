package data.structure.nodes;

public class LNode<T> {

	T data;
	LNode<T> next;
	
	public LNode(T data){
		
		this.data = data;
		next = null;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LNode<T> getNext() {
		return next;
	}

	public void setNext(LNode<T> next) {
		this.next = next;
	}
	
}