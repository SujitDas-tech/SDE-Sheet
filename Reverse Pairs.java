import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int merge(int start,int mid,int end,ArrayList<Integer> arr,int[] temp){
        int ans=0;
        int j=mid;
        int i=start;
        while(i<mid && j<=end){
            int vali = arr.get(i);
            int valj = arr.get(j);
            if(vali > 2*valj){
                j++;
                ans+=(mid-i);
            }
            else{
                i++;
            }
        }
        j=mid;
        i=start;
        int k=start;
        while(i<mid && j<=end){
            if(arr.get(i)<=arr.get(j)){
                temp[k++]=arr.get(i++);
            }
            else{
                temp[k++]=arr.get(j++);
            }
        }
        while(i<mid){
            temp[k++]=arr.get(i++);
        }
        while(j<=end){
            temp[k++]=arr.get(j++);
        }
        for(int l=start;l<=end;l++){
            arr.set(l,temp[l]);
        }
        return ans;
    }
    public static int sort(int start,int end,ArrayList<Integer> arr){
        int ans=0;
        if(start<end){
            int[] temp = new int[arr.size()];
            int mid = (start+end)/2;
            ans+=sort(start,mid,arr);
            ans+=sort(mid+1,end,arr);
            ans+=merge(start,mid+1,end,arr,temp);
        }
        return ans;
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        return sort(0,arr.size()-1,arr);
    }
}
