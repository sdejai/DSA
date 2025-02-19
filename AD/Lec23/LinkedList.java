package LinkedList;

public class LinkedList {
	class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	int size;
	void addFirst(int value) {
		Node temp = new Node();
		temp.data = value;
		if (size == 0) {
			head = temp;
			tail = temp;
			size++;
		} else {
			temp.next = head;
			head = temp;
			size++;
		}
	}
}
