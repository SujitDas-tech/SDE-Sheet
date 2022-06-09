import java.util.* ;
import java.io.*; 
public class Solution {
    
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(arr[i]);
        }
        int ans=0;
        for(int i=0;i<N;i++){
            int val = arr[i];
            int count=0;
            if(!set.contains(val-1)){
                while(set.contains(val)){
                    count++;
                    val++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}
