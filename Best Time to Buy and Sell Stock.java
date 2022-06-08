import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int profit = 0;
        for(Integer i : prices){
            min= Math.min(i,min);
            profit = Math.max(profit,i-min);
        }
        return profit;
    }
}
