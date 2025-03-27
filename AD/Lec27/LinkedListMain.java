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
//		System.out.println(ll.getNode(4).data);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.removeFirst());
//		ll.disply();
//		System.out.println(ll.removeLast());
//		ll.disply();
//		System.out.println(ll.sizeLL());
		System.out.println(ll.removeByIndex(3));
//		ll.disply();
	}

}
