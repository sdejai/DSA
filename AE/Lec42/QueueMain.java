package Queue;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		Queue qt = new Queue();
		System.out.println(qt.isEmpty());
		System.out.println(qt.isFull());
		qt.enqueue(11);
		qt.enqueue(12);
		qt.enqueue(13);
		qt.enqueue(16);
		qt.display();
		System.out.println(qt.dequeue());
		qt.enqueue(130);
		qt.enqueue(160);
		qt.display();
//		qt.enqueue(160);
//		qt.display();
	}

}
