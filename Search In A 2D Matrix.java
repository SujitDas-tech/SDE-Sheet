import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static boolean BS(int start,int end,List<Integer> a,int target){
        if(start<=end){
            int mid = (start+end)/2;
            if(a.get(mid)==target){
                return true;
            }
            if(a.get(mid)>target){
                return BS(start,mid-1,a,target);
            }
            else{
                return BS(mid+1,end,a,target);
            }
        }
        return false;
    }
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        List<Integer> temp = new ArrayList<>();
        for(List<Integer> i : mat){
            if(target<=i.get(n-1)){
                temp = i;
                break;
            }
        }
        if(temp.size()==0){
            return false;
        }
        return BS(0,n-1,temp,target);
	}
}
