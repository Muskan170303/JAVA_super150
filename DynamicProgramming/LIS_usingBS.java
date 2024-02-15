package DynamicProgramming;

public class LIS_usingBS {

	public static void main(String[] args) {
		int arr[]= {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
		System.out.println(LIS(arr));

	}
	public static int LIS(int arr[]) {
		int dp[]=new int[arr.length];
		dp[0]=arr[0];
		int len=1;
		for(int i=1;i<dp.length;i++) {
			if(dp[len-1]<arr[i]) {
				dp[len]=arr[i];
				len++;
			}
			else {
				int ind=BS(dp,0,len-1,arr[i]);
				dp[ind]=arr[i];
			}
		}
		return len;
		
	}
	public static int BS(int[] dp, int i, int j, int item) {
		int ind=0;
		while(i<=j) {
			int mid=(i+j)/2;
			if(dp[mid]>item) {
				ind=mid;
				j=mid-1;
			}
			else{
				i=mid+1;
			}
		}
		return ind;
	}

}
