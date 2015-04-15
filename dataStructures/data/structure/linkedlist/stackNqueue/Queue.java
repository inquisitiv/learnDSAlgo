package data.structure.linkedlist.stackNqueue;

import data.structure.nodes.LNode;

public class Queue<T> {

	LNode<T> front;
	LNode<T> rear;
	int size;
	
	public int getSize() {
		return size;
	}
	
	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enQueue(T data) {
		LNode<T> temp = new LNode<T>(data);
		size++;
		if (front == null && rear == null) {
			front = temp;
			rear = temp;
		} else {
			rear.setNext(temp);
			rear = temp;
		}
	}

	public T deQueue() {
		if (front == null && rear == null) {
			System.out.println("Error : Queue is empty!");
			return null;
		}
		size--;
		if (front == rear) {
			T temp = front.getData();
			front = null;
			rear = null;
			return temp;
		} else {
			T temp = front.getData();
			front = front.getNext();
			return temp;
		}
	}

	public T peek() {
		if (front == null && rear == null) {
			return null;
		}
		return front.getData();
	}

	public boolean isEmpty() {
		if (front == null && rear == null)
			return true;
		return false;
	}

	public void delete() {
		front = null;
		rear = null;
		size=0;
	}
	
	/*
	public int size() {
		if (front == null && rear == null)
			return 0;
		if (front == rear) {
			return 1;
		}
		LNode<T> temp = front;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.getNext();
		}
		return size;
	}
	*/

}
