import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
        LinkedListNode<Integer> dummy = new LinkedListNode(0);
        dummy.next = head;
        LinkedListNode<Integer> fast = dummy;
        LinkedListNode<Integer> slow = dummy;
        for(int i=0;i<K;i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        if(K==0){
            return dummy.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
	}
}
