import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        LinkedListNode ans = new LinkedListNode(0);
        LinkedListNode temp = ans;
        int ext =0;
        
        while(head1!=null && head2!=null && head1.data!=-1 && head2.data!=-1){
            int val = head1.data+head2.data+ext;
            if(val>=10){
                ext = val/10;
                val = val%10;
            }
            else{
                ext=0;
            }
            temp.next  = new LinkedListNode(val);
            temp = temp.next;
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1!=null && head1.data!=-1){
            int val = head1.data+ext;
            if(val>=10){
                ext = val/10;
                val = val%10;
            }
            else{
                ext=0;
            }
            temp.next  = new LinkedListNode(val);
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2!=null && head2.data!=-1){
            int val = head2.data+ext;
            if(val>=10){
                ext = val/10;
                val = val%10;
            }
            else{
                ext=0;
            }
            temp.next  = new LinkedListNode(val);
            temp = temp.next;
            head2=head2.next;
        }
        if(ext!=0){
            temp.next  = new LinkedListNode(ext);
        }
        return ans.next;
    }
}
