import java.util.* ;
import java.io.*; 
public class Solution 
{
    //Dutch National Flag Algorithm
    public static void sort012(int[] arr)
    {
        //Write your code here
        int i=0;
        int m=0;
        int j= arr.length-1;
        while(m<=j){
            if(arr[m]==1){
                m++;
            }
            else if(arr[m]==0){
                int temp = arr[i];
                arr[i]=arr[m];
                arr[m]=temp;
                i++;
                m++;
            }
            else{
                int temp=arr[j];
                arr[j]=arr[m];
                arr[m]=temp;
                j--;
            }
        }
    }
}
