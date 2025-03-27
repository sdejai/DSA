package Codes;

public class ReverseLinkedList {
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

    public ListNode reverseList(ListNode head) {
        ListNode currNode=head;
        ListNode preNode=null;
        ListNode nextNode;
        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next=preNode;
            preNode=currNode;
            currNode=nextNode;
        }
        return preNode;
    }
}
