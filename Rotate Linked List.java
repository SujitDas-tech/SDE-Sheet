import java.util.* ;
import java.io.*; 
/***********************************************
    Following is the class structure of the Node class:

    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        int length = 0;
        Node temp = head;
        while(temp!=null && temp.data!=-1){
            length++;
            temp = temp.next;
        }
        int K = length -(k%length);
        if(K==length){
            return head;
        }
        //System.out.println(length);
        Node current = head;
        while(K-- > 1){
            current = current.next;
        }
        Node start = current.next;
        while(start!=null && start.next!=null && start.next.data!=-1){
            start=start.next;
        }
        Node ans = current.next;
        current.next = null;
        start.next = head;
        return ans;
    }
}
