import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            return a.start==b.start ? a.finish-b.finish : a.start - b.start;
        });
        Integer start = intervals[0].start;
        Integer end = intervals[0].finish;
        for(Interval i : intervals){
            if((i.start>=start && i.start<=end) || (i.finish>=start && i.finish <= end) ){
                  start = Math.min(start,i.start);
                  end = Math.max(end,i.finish);
                
            }
            else{
                ans.add(new Interval(start,end));
                start = i.start;
                end = i.finish;
            }
        }
        ans.add(new Interval(start,end));
        return ans;
    }
}
