import java.util.* ;
import java.io.*; 
public class Solution {
    //More Voting Algorithm
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        Map<Integer,Integer> m = new HashMap<>();
        int ele=-1;
        for(int i=0;i<n;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry i : m.entrySet()){
            if((int)i.getValue() > Math.floor(n/2)){
                ele =(int) i.getKey();
            }
        }
        return ele;
	}
}
