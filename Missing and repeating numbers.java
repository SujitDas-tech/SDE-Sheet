import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        boolean[] tracker = new boolean[n+1];
        int repeat=0;
        int missing = 0;
        for(Integer i : arr){
            if(!tracker[i]){
                tracker[i]=true;
            }
            else{
                repeat = i;
            }
        }
        for(int i=1;i<=n;i++){
            if(!tracker[i]){
                missing = i;
                break;
            }
        }
        return new int[]{missing,repeat};
    }
}
