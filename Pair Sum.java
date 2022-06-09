import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        int k=0;
        List<int[]> result = new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int dif = s-arr[i];
            if(m.containsKey(dif)){
               int count = m.get(dif);
                while(count > 0){
                   result.add(new int[]{dif,arr[i]}); 
                   count--;
                }
                
            }
                m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            
            
        }
        int[][] ans = new int[result.size()][2];
        for(int[] i : result){
            ans[k++]=i;
        }
        Arrays.sort(ans,(a,b)->{
           return a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]; 
        });
        return ans;
    }
}
