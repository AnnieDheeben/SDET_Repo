 package DSA.CW;

public class ListNode {
	int val;
    ListNode next;
    ListNode head;
    ListNode prev;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
