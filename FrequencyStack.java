/*
For implementation of frequency stack two points are main 
1.Track the occurance of each value in a HashMap;
2.Track the elements of same frequency in a HashMap;
3.Use linkedlist to store each same frequency elements;
4.Use a variable that will staore the maximum frequency among all the elements.
5.during the pop remove max frequency elements first.
6.if the linked list is empty then decrease the max frequency by 1;
*/
import java.util.*;
import java.io.*;

class FreqStack {
    public Map<Integer,Integer> m;
    public Map<Integer,LinkedList<Integer>> l;
    int maxf;
    public FreqStack() {
        m = new HashMap<>();
        l = new HashMap<>();
        maxf=0;
    }
    
    public void push(int val) {
        int currF = m.getOrDefault(val,0);
        currF++;
        m.put(val,currF);
        if(l.containsKey(currF)==false){
            l.put(currF,new LinkedList<>());
        }
        l.get(currF).addFirst(val);
        maxf=Math.max(maxf,currF);
    }
    
    public int pop() {
        int val = l.get(maxf).removeFirst();
        m.put(val,m.get(val)-1);
        if(l.get(maxf).size()==0){
            maxf--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
