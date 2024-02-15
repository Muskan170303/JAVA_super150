package DynamicProgramming;

import java.util.Arrays;

public class OptimalGameStrategyII {

	public static void main(String[] args) {
		int n=4;
		int coin[]= {1, 2, 3, 4};
		int dp[][]=new int[n][n];
		for(int i[]: dp) {
			Arrays.fill(i,-1);
		}
//		System.out.println(choose(coin));
		System.out.println(chooseTD(coin,0,n-1,dp));
	}
	public static int chooseTD(int coin[], int i, int j,int dp[][]) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int f=coin[i]+Math.min(chooseTD(coin,i+2,j,dp),chooseTD(coin,i+1,j-1,dp));
		int l=coin[j]+Math.min(chooseTD(coin,i+1,j-1,dp),chooseTD(coin,i,j-2,dp));
		return dp[i][j]=Math.max(f, l);
	}
//	public static int choose(int coin[]) {
//		int dp[][]=new int[coin.length][coin.length];
//		for(int i=0;i<coin.length;i++) {
//			dp[i][i]=coin[i];
//		}
//		for(int i=coin.length-1;i>=0;i--) {
//			for(int j=i+1;j<coin.length;j++) {
//				int f=coin[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
//				int l=coin[j]+Math.min(dp[i+1][j-1],dp[i][j-2]);
//				dp[i][j]=Math.max(f, l);
//			}
//		}
//		return dp[0][coin.length-1];
//	}

}
