package DoubleLinkedList;

public class DoubleLinkedList {
	class Node {
		int data;
		Node next;
		Node pre;
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
			head.pre=temp;
			head = temp;
			size++;
		}
	}

	void addLast(int value) {
		Node temp = new Node();
		temp.data = value;
		if (size == 0) {
			addFirst(value);
		} else {
			tail.next = temp;
			temp.pre=tail;
			tail = temp;
			size++;
		}
	}
	
}
