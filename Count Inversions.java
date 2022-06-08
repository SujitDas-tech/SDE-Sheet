public class Solution {
	public static long merge(long[] arr,int start,int mid,int end,long[] temp){

		int i=start;
		int j=mid;
		int k=start;
		long len=0;
		while(i<=mid-1 && j<=end){
			if(arr[i]<=arr[j]){
				temp[k++]=arr[i++];
			}
			else{
				temp[k++]=arr[j++];
				len += (mid-i);
				
			}
		}
		while(i<=mid-1){
			temp[k++]=arr[i++];
		}
		while(j<=end){
			temp[k++]=arr[j++];
		}
		for(int l=start;l<=end;l++){
			arr[l]=temp[l];
		}
		return len;
	}
	public static long divide(long[] arr,long[] temp,int start,int end){
		long len=0;
		if(start<end){
			int middle = (start+end)/2;
			len+=divide(arr,temp,start,middle);
			len+=divide(arr,temp,middle+1,end);
			len+=merge(arr,start,middle+1,end,temp);
			
		}
		return len;
	}
    public static long getInversions(long arr[], int n) {
        // Write your code here.
		long[] temp = new long[n];
		long ans = divide(arr,temp,0,arr.length-1);
		return ans;
    }
}
