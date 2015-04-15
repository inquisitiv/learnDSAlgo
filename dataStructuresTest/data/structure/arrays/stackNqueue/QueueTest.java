package data.structure.arrays.stackNqueue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> Q = new Queue<Integer>(9);
		Q.enQueue(1);
		Q.enQueue(2);
		Q.enQueue(3);
		Q.enQueue(4);
		Q.enQueue(5);
		Q.enQueue(6);
		Q.enQueue(7);
		Q.enQueue(8);
		Q.enQueue(9);
		Q.deQueue();
		Q.deQueue();
		Q.enQueue(12);
		Q.enQueue(13);
		Q.enQueue(14);
		Q.enQueue(15);
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		System.out.println(Q.deQueue());
		
	}
	
}
