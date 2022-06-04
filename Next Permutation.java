import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static void Reverse(ArrayList<Integer> permu,int start,int end){
        for(int i=start;i<=(start+end)/2;i++){
            int temp = permu.get(i);
            permu.set(i,permu.get(end-i+start));
            permu.set((end-i+start),temp);
        }
    }
    public static void swap(ArrayList<Integer> permu,int i,int j){
        int temp = permu.get(i);
        permu.set(i,permu.get(j));
        permu.set(j,temp);
    }
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permu) 
	{
		// Write your code here.
        int i = permu.size()-2 ;
        while(i>=0){
            if(permu.get(i)<permu.get(i+1)){
                break;
            }
            i--;
        }
        if(i==-1){
            Reverse(permu,0,permu.size()-1);
            return permu;
        }
        int j=permu.size()-1;
        while(j>i){
            if(permu.get(j)>permu.get(i)){
                break;
            }
            j--;
        }
        swap(permu,i,j);
        Reverse(permu,i+1,permu.size()-1);
        return permu;
	}
}
