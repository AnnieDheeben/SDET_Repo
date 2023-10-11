 package mandatoryHomeWork.DSA;

public class ListNode {
	int val;
    ListNode next;
	ListNode head;
	ListNode currentNode;
	public static int size=0;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
	public String print(ListNode head2) {
		currentNode = head;
		StringBuilder sb = new StringBuilder();
		while(currentNode!=null) {
			//System.out.println(currentNode.val+"->");
			sb.append(currentNode.val).append("->");
			currentNode = currentNode.next;
		}
			sb.append("null");
		return sb.toString();
		
	}
	public int size() {
		return size;
	}
}
