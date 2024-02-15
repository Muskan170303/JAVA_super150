package DynamicProgramming;

import java.util.Arrays;

public class CoinChangeII {

	public static void main(String[] args) {
		int amount = 5; 
		int coins[] = {1,2,5};
		int dp[][]=new int[amount+1][coins.length];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(coinsumTD(amount,coins,0,dp));
		System.out.println(coinsumBU(amount,coins));

	}
	public static int coinsumTD(int sum, int coins[], int ind, int dp[][]){
		if(ind==coins.length) {
        	return 0;
        }
		if(sum==0) {
        	return 1;
        }
		if(dp[sum][ind]!=-1){
			return dp[sum][ind];
		}
		int inc=0;
		if(sum>=coins[ind]) {
			inc=coinsumTD(sum-coins[ind],coins,ind,dp);
		}
		int exc=coinsumTD(sum,coins,ind+1,dp);
		return dp[sum][ind]=inc+exc;
    }
	
	public static int coinsumBU(int sum, int coins[]){
		int dp[][]=new int[sum+1][coins.length+1];
		Arrays.fill(dp[0], 1);
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				int inc=0;
				if(i>=coins[j-1]) {
					inc=dp[i-coins[j-1]][j];
				}
				int exc=dp[i][j-1];
				dp[i][j]=inc+exc;
			}
		}
		return dp[dp.length-1][dp[0].length-1];
    }

}
