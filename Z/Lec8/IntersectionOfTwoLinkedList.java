package Codes;

public class IntersectionOfTwoLinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static int getLength(ListNode node) {
		int len = 0;
		while (node != null) {
			node = node.next;
			len++;
		}
		return len;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tempA = headA;
		ListNode tempB = headB;
		int lenA = getLength(tempA);
		int lenB = getLength(tempB);
		while (lenA > lenB) {
			lenA--;
			headA = headA.next;

		}
		while (lenB > lenA) {
			lenB--;
			headB = headB.next;

		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}

		return headA;
	}
}
