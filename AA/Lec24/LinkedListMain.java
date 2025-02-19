package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(120);
		ll.addFirst(100);
		ll.disply();
		ll.addLast(13);
		ll.disply();
		ll.addByIndex(17, 1);
		ll.disply();
		System.out.println(ll.getNode(3).data);
	}

}
