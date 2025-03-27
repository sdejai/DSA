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


	int sizeLL() {
		return size;
	}

	int getFirst() {
		return head.data;
	}

	int getLast() {
		return tail.data;
	}

	int getByIndex(int index) {
		return getNode(index).data;
	}

	Node getNode(int index) {
		Node temp = head;
		int i = 1;
		while (temp!=null) {
			if(i==index) {
				return temp;
			}
			temp = temp.next;
			i++;
		}
		return temp;
	}

	void disply() {
		Node temp = head;
		System.out.print("null<-->");
		while (temp != null) {
			System.out.print(temp.data + "<-->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
