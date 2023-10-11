package mandatoryHomeWork.DSA;
public class AddLinkedList {
	
	ListNode head , tail, currentNode;
    public static int size = 0 ;

       public void add(int value){
        if(head == null)  
            head = tail = new ListNode(value);
        else{
            tail.next = new ListNode(value); 
            tail = tail.next;
        }
        size++;
    }

	public ListNode removeElements(int valToRemove) {
		if(head == null) return null;
		while(head!=null && head.val==valToRemove) {
				head = head.next;
		}
		ListNode current = head;
		while(current!=null && current.next!=null) {
			if(current.next.val == valToRemove) {
				current.next = current.next.next;
				size--;
			}
			else {
				current = current.next;
			}
		}
			return head;
		}

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
