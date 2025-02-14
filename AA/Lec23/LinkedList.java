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

	void disply() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
