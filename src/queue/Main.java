package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(7);
		
//		myQueue.dequeue();
//		myQueue.printQueue();
//		myQueue.getFirst();
//		myQueue.getLast();
//		myQueue.getLength();
//		myQueue.printQueue();
		myQueue.enqueue(69);
		myQueue.enqueue(79);
		myQueue.enqueue(89);
		System.out.println();
		myQueue.printQueue();
		myQueue.dequeue();
		System.out.println();
		myQueue.printQueue();
		myQueue.dequeue();
		System.out.println();
		myQueue.printQueue();
	}

}
