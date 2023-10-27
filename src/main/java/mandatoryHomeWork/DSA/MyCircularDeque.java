package mandatoryHomeWork.DSA;

import java.util.Deque;

import org.junit.Test;

class MyCircularDeque {
    int maxSize, currSize;
    Node head, tail;

public class Node {
        int value;
        Node next, prev;
        Node(int value) {
            this.value = value;
				}
}

    public MyCircularDeque(int k) {
				maxSize = k;
        this.currSize = 0; 
				this.head = null;
				this.tail = null;
        }
    
    public boolean insertFront(int value) {
        if(currSize==maxSize) return false;
		Node newNode = new Node(value);
		currSize++;
		if(head==null){
			head=tail=newNode;
		}
		else{
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
    }
		if(tail==null){
			tail=head;
		}
		return true;
		}
    
    public boolean insertLast(int value) {
        if(currSize==maxSize) return false;
		Node newNode = new Node(value);
		currSize++;
		if(head==null){
			head=tail=newNode;
			return true;
		}
		newNode.next=head;
		head.prev = newNode;
		head = newNode;
		return true;
    }
    
    public boolean deleteFront() {
        if(head==null) return false;
				currSize--;
				if(head==tail){
					head=tail=null;
					return true;
				}
			head = head.next;
			head.prev = tail;
			return true;
		}
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
				currSize--;
				if(head==tail){
					head=tail=null;
					return true;
				}
			tail = tail.prev;
			return true;
    }
    
    public int getFront() {
        int val = 0;
		if(isEmpty()) return -1;
		else {
		val = head.value;
		}
		return val;
    }
    
    public int getRear() {
    	if(tail==null) return -1;
			return tail.value;
		}
    
    public boolean isEmpty() {
        return (currSize==0);
		
    }
    
    public boolean isFull() {
        return (currSize==maxSize);
    }

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */	 @Test
	 public void test1() {
		 MyCircularDeque obj = new MyCircularDeque(5);
		 boolean param_1 = obj.insertFront(30);
		 boolean param_2 = obj.insertLast(100);
		 boolean param_3 = obj.deleteFront();
		 boolean param_4 = obj.deleteLast();
		 int param_5 = obj.getFront();
		 int param_6 = obj.getRear();
		 boolean param_7 = obj.isEmpty();
		 boolean param_8 = obj.isFull();
		 
	 }
}
