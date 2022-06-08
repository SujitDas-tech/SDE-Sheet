import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int count1=0;
        int count2=0;
        int ele1=0;
        int ele2=0;
        for(Integer i : arr){
            if(ele1==i){
                count1++;
            }
            else if(ele2==i){
                count2++;
            }
            else if(count1==0){
                ele1=i;
                count1++;
            }
            else if(count2==0){
                ele2=i;
                count2++;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(Integer i : arr){
            if(ele1==i){
                count1++;
            }
            if(ele2==i){
                count2++;
            }
        }
       ArrayList<Integer> ans = new ArrayList<>();
        if(count1>Math.floor(arr.size()/3)){
            ans.add(ele1);
        }
        if(!ans.contains(ele2) && count2>Math.floor(arr.size()/3)){
            ans.add(ele2);
        }
       return ans;
    }
}
