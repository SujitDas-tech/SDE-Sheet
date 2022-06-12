import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class Solution {
    public static Node findMiddle(Node head) 
    {
        // Write your code here
        Node first = head;
        Node slow = head;
        while(first!=null && first.next!=null){
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
