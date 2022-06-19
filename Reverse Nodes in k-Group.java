import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
        {
        public:
	        int data;
	        Node *next;
	        Node(int data)
	        {
		        this->data = data;
		        this->next = NULL;
	        }
        };

*****************************************************************/

public class Solution {
	public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here.
        int len=0;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;
        Node next = null;
        Node temp=null;
        while(current!=null && current.data!=-1){
            len++;
            temp=current;
            current = current.next;
        }
        if(len<=1){
            return head;
        }
        temp.next=null;
        for(int i=0;i<b.length;i++){
            if(b[i]>len){
                b[i]=len;
            }
            if(len>=b[i] && prev.next!=null && b[i]!=0){
                current = prev.next;
                next = current.next;
                for(int j=1;j<b[i];j++){
                    current.next = next.next;
                    next.next = prev.next;
                    prev.next = next;
                    next = current.next;
                }
                prev=current;
                len-=b[i];
            }
        }
        return dummy.next;
	}
}
