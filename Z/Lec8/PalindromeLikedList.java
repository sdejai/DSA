package Codes;

import java.util.ArrayList;

public class PalindromeLikedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}


	
	public static ListNode reverseList(ListNode temp) {
		ListNode currNode = temp;
		ListNode preNode = null;
		ListNode nextNode;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = nextNode;
		}
		return preNode;
	}

	public boolean isPalindrome(ListNode head) {
		ListNode headCopy = head;
		ArrayList<Integer> arr = new ArrayList<>();
		while (head != null) {
			arr.add(head.val);
			head = head.next;
		}
		ListNode reverseHead = reverseList(headCopy);
		int i = 0;
		while (reverseHead != null) {
			if (arr.get(i) != reverseHead.val) {
				return false;
			}
			i++;
			reverseHead = reverseHead.next;
		}
		return true;
	}
}
