package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(12);
		ll.addFirst(100);
//		ll.disply();
//		ll.addLast(13);
//		ll.disply();
		ll.addFirst(13);
		ll.addFirst(199);
//		ll.addFirst(1);
//		ll.disply();
//		ll.addLast(15);
		ll.disply();
		ll.addByIndex(17, 5);
		ll.disply();

//		ll.disply();
	}

}
