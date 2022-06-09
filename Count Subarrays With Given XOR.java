import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        int XOR =0;
        int ans=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(Integer i : arr){
            XOR^=i;
            if((XOR^x)==0){
                ans++;
            }
            if(m.containsKey(XOR^x)){
                ans+=m.get(XOR^x);
            }
            m.put(XOR,m.getOrDefault(XOR,0)+1);
        }
        return ans;
	}
}
