package Queue;

public class Queue {
	private int arr[];
	private int front = 0;
	private int size = 0;
	public Queue() {
		arr=new int[5];
	}
	public Queue(int n) {
		arr=new int[n];
	}
	public boolean isEmpty() {
		return size==0;
	}

}
