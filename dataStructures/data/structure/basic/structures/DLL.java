package data.structure.basic.structures;

import java.util.Iterator;

import data.structure.nodes.TNode;

public class DLL<T> implements Iterable<T> {
	
	TNode<T> start;
	
	public DLL() {
		
		start = null;
	}

	public void insert(T data)
	{
		if(start==null)
		{
			start = new TNode<T>(data);
			start.setLeft(null);
			start.setRight(null);
		}
		else
		{
			TNode<T> temp = start;
			while(temp.getRight()!=null)
			{
				temp=temp.getRight();
			}
			temp.setRight(new TNode<T>(data));
			temp.getRight().setLeft(temp);
		}
	}
	
	public void deleteFromFront()
	{
		if(start!=null)
		{
			start=start.getRight();
			start.setLeft(null);
		}
	}
	
	public void deleteFromEnd()
	{
		if(start==null)
			return;
		TNode<T> temp = start;
		while(temp.getRight()!=null)
		{
			temp = temp.getRight();
		}
		temp.getLeft().setRight(null);
	}
	
	public void deleteItem(T item)
	{
		if(start==null)
			return;
		TNode<T> temp = start;
		while(temp!=null)
		{
			if(temp.getData()==item)
			{
				temp.getLeft().setRight(temp.getRight());
				temp.getRight().setLeft(temp.getLeft());
			}
			temp = temp.getRight();
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new DLLIterator();
	}
	
	private class DLLIterator implements Iterator<T> {

		TNode<T> current = start;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T temp = current.getData();
			current=current.getRight();
			return temp;
		}

		@Override
		public void remove() {
			// not supported
			
		}
		
	}
	
    public TNode<T> findNode(T T){
		
		if(start==null)
			return null;
		if(start.getData()==T)
		{
			return start;
		}
		else
		{ 
		  TNode<T> temp = start.getRight(); 
		   while(temp!=null)
		   {
			   if(temp.getData()==T)
				   return temp;
			   temp=temp.getRight();
		   }
		   return  null;
		}
		
	}
	
	public boolean isEmpty() {
		
		return start == null;
	}
}
	
