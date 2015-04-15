import data.structure.linkedlist.stackNqueue.Stack;


public class TowerOfHanoi {
	
	public static void towerOfHanoi(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c, int n)
	{
		
		if(n==1)
		{
			c.push(a.pop());
			return;
		}
		
		towerOfHanoi(a,c,b,n-1);
		c.push(a.pop());
		towerOfHanoi(b,a,c,n-1);
		
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> b = new Stack<Integer>();
		Stack<Integer> c = new Stack<Integer>();
		
		a.push(8);
		a.push(7);
		a.push(6);
		a.push(5);	
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);	
		System.out.println("-----------------------------");
		System.out.println("Is A empty ? "+a.isEmpty()+"SIZE is : "+a.getSize());
		System.out.println("Is B empty ? "+a.isEmpty()+"SIZE is : "+b.getSize());
		System.out.println("Is C empty ? "+a.isEmpty()+"SIZE is : "+c.getSize());
		
		System.out.println("------ tower of hanoi -------");
		towerOfHanoi(a,b,c,8);
		System.out.println("Is A empty ? "+a.isEmpty()+"SIZE is : "+a.getSize());
		System.out.println("Is B empty ? "+a.isEmpty()+"SIZE is : "+b.getSize());
		System.out.println("Is C empty ? "+a.isEmpty()+"SIZE is : "+c.getSize());
		System.out.println("----- contents of tower -----");
		while(!c.isEmpty())
		System.out.println(c.pop());
		System.out.println("-----------------------------");
		
		
	}
	
}
