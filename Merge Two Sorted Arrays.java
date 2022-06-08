import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int start = m+n-1;
        while(start>=0 && arr1[start]==0){
            start--;
        }
        if(start>=0){
            for(int i=n-1;i>=0;i--){
                int j=start-1;
                int last = arr1[start];
                while(j>=0 && arr1[j]>arr2[i]){
                    arr1[j+1]=arr1[j];
                    j--;
                }
                if(j!=start-1 || last>arr2[i]){
                    arr1[j+1]=arr2[i];
                    arr2[i]=last;
                }
            }
        }
        int j=0;
        for(int i=start+1;i<m+n;i++){
            arr1[i]=arr2[j++];
        }
        return arr1;
    }
}
