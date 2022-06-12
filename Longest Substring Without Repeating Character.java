import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        Map<Character,Integer> m = new HashMap<>();
        int left=0;
        int ans=0;
        for(int i=0;i<input.length();i++){
            if(m.containsKey(input.charAt(i))){
                left = Math.max(left,m.get(input.charAt(i))+1);
            }
            m.put(input.charAt(i),i);
            ans=Math.max(ans,(i-left+1));
        }
        return ans;
	}
}
