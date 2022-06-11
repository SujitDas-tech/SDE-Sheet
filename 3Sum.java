import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
        Set<ArrayList<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int l=arr.length-1;
            int sum= K-arr[i];
            while(j<l){
                if(arr[j]+arr[l]==sum){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[l]);
                    ans.add(new ArrayList(temp));
                    l--;
                    while(l>=0 && arr[l]==arr[l+1]){
                        l--;
                    }
                }
                else if( arr[j]+arr[l]>sum){
                    l--;
                }
                else{
                    j++;
                }
                
            }
            
        }
        return new ArrayList(ans);
	}
}
