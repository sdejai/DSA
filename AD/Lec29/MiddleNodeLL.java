package Codes;

public class MiddleNodeLL {

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

	public ListNode middleNode(ListNode head) {
		ListNode slowerNode = head;
		ListNode fasterNode = head;
		while (fasterNode != null && fasterNode.next != null) {
			fasterNode = fasterNode.next.next;
			slowerNode = slowerNode.next;
		}
		// int len=0;
		// while(temp!=null){
		// len++;
		// temp=temp.next;
		// }
		// int i=1;
		// while(i<=len/2){
		// i++;
		// head=head.next;
		// }
		return slowerNode;
	}
}
