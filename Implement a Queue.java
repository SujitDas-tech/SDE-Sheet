import java.util.*;
public class Queue {
    LinkedList<Integer> Q;
    Queue() {
        // Implement the Constructor
        Q = new LinkedList<>();
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(Q.size()==0){
            return true;
        }
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        Q.add(data);
    }

    int dequeue() {
        // Implement the dequeue() function
        if(Q.size()==0){
            return -1;
        }
        return Q.poll();
    }

    int front() {
        // Implement the front() function
        if(Q.size()==0){
            return -1;
        }
        return Q.peekFirst();
    }

}
