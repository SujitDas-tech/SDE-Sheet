import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int fast=0;
        int second = 0;
        do{
            fast = arr.get(fast);
            second = arr.get(arr.get(second));
        }while(fast!=second);
        fast=0;
        while(fast!=second){
            fast = arr.get(fast);
            second = arr.get(second);
        }
        return fast;
    }
}
