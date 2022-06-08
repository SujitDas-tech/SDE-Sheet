import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        Map<Integer,Integer> m = new HashMap<>();
        int ans=0;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum==0){
                ans=Math.max(ans,i+1);
            }
            else{
                if(m.containsKey(sum)){
                    ans=Math.max(ans,i-m.get(sum));
                }
                else{
                    m.put(sum,i);
                }
            }
        }
        return ans;
	}
}
