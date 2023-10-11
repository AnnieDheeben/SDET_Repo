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
    
       public ListNode add(int[] value){
           for(int each : value) add(each);
           return head;
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
	
	public ListNode middleNode() {
		ListNode currentNode = head;
	    ListNode resNode = head;
	    int currSize=0;
	    int middle = 0;
	    while(currentNode!=null){
	            currentNode = currentNode.next;
	            currSize++;
	        }
	    middle = size/2;
	    for(int i=1;i<=middle;i++){
	        resNode =resNode.next;
	    }
	    return resNode;
		
	}

	public ListNode middleNode_way2() {
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;	
	}
	
	public static void printList(ListNode head) {
		ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();
	}

	public int size() {
		
		return size;
	}
	
	public void printFromNode(ListNode node) {
	    ListNode current = node;
	    
	    while (current != null) {
	        System.out.print(current.val + " -> ");
	        current = current.next;
	    }
	    
	    System.out.println("null");
	}
}
