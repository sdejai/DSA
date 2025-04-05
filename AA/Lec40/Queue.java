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
	public void enqueue(int element){
		int index=front+size;
		arr[index]=element;
		size++;
	}
	public int dequeue(){
		int removeElement=arr[front];
		front=front+1;
		size--;
		return removeElement;
	}

}
