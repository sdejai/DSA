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

	void addByIndex(int value, int index) {
		if (index == 1) {
			addFirst(value);
		} else if (size+1 == index) {
			addLast(value);
		} else {
			Node temp = new Node();
			temp.data = value;
			Node preNode = getNode(index - 1);
			Node nextNode = preNode.next;
			temp.next = nextNode;
			preNode.next = temp;
			temp.pre=preNode;
			nextNode.pre=temp;
			size++;
		}
	}

	public int removeFirst() {
		int removeElement = head.data;
		if (size == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = head.next;
			head.pre=null;
			temp.next = null;
		}
		size--;
		return removeElement;
	}


	public int removeLast() {
		if (size == 1) {
			return removeFirst();
		} else {
			int removeElement = tail.data;
			Node tempNode = getNode(size - 1);
			tempNode.next = null;
			tail.pre=null;
			tail = tempNode;
			size--;
			return removeElement;
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
