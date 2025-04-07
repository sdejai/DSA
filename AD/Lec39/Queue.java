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
	public boolean isFull() {
		return size==arr.length;
	}
	public void enqueue(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full!");
		}
		int index=(front+size)%arr.length;
		arr[index]=element;
		size++;
	}
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty!");
		}
		int removeElement=arr[front];
		front=(front+1)%arr.length;
		size--;
		return removeElement;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			int index=(front+i)%arr.length;
			System.out.print(arr[index]+" ");
		}
		System.out.println();
	}
}
