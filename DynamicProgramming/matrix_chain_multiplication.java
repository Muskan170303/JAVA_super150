package DynamicProgramming;

public class matrix_chain_multiplication {

	public static void main(String[] args) {
		int order[]={4,2,3,5,1};
		int dp[][]=new int[order.length][order.length];
		System.out.println(MCM(order,0,order.length-1,dp));

	}
	public static int MCM(int arr[], int i, int j, int dp[][]) {
		if(i+1==j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int ans=Integer.MAX_VALUE;
		for(int k=i+1;k<j;k++) {
			int fs=MCM(arr,i,k,dp);
			int ls=MCM(arr,k,j,dp);
			int self=arr[i]*arr[j]*arr[k];
			ans=Math.min(ans, fs+ls+self);
		}
		return dp[i][j]=ans;
	}
	
	// bottom up same as coin change

}
