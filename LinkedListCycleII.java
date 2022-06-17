import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

        class Node
		{
		    public int data;
		    public Node next;

		    Node(int data)
		    {
		        this.data = data;
		        this.next = null;
		    }
		}

*****************************************************************/

public class Solution 
{
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.data!=-1 && fast.next!=null && fast.next.data!=-1){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.data==-1 || fast.next==null || fast.next.data==-1){
            return null;
        }
        Node temp = head;
        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
}
