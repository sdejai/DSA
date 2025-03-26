package Stack;

public class Stack {
	private int[] arr;
	private int index=-1;
	
	public Stack() {
		arr= new int[5];
	}
	public Stack(int n) {
		arr= new int[n];
	}
	public boolean isEmpty() {
		return index==-1;
	}
	public boolean isFull() {
		return index==arr.length-1;
	}
	public void push(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Stack is full");
		}
		index++;
		arr[index]=element;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack khali h bhai!");
		}
		int removeElement =arr[index];
		index--;
		return removeElement;
	}

}
