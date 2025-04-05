package Queue;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		Queue qt = new Queue();
		qt.enqueue(11);
		qt.enqueue(12);
		qt.enqueue(13);
		qt.enqueue(16);
		qt.dequeue();
	}

}
