package LinkedList;

public class LinkedList {
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	int size;
	void addFirst(int value) {
		Node temp = new Node();
		temp.data=value;
		if(size==0) {
			head=temp;
			tail=temp;
			size++;
		}
		else {
			temp.next=head;
			head=temp;
			size++;
		}
	}
	void addLast(int value) {
		Node temp = new Node();
		temp.data=value;
		if(size==0) {
			addFirst(value);
		}
		else {
			tail.next=temp;
			tail=temp;
			size++;
		}
	}
	void addByIndex(int value,int index) {
		if(size==0) {
			addFirst(value);
		}
		else if(size==index) {
			addLast(value);
		}
		else {
			Node temp = new Node();
			temp.data=value;
			Node previousIndex =getNode(index-1);
			temp.next=previousIndex.next;
			previousIndex.next=temp;
			size++;
		}
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
		Node temp=head;
		int i=0;
		while(i<index) {
			temp=temp.next;
		}
		return temp;
	}
	void disply() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +"-->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
