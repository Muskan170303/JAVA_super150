package BitMasking;

import java.util.Arrays;

//https://atcoder.jp/contests/dp/tasks/dp_i

public class I_Coins {

	public static void main(String[] args) {
		int n=5;
		double coin[]= {0.42, 0.01, 0.42, 0.99, 0.42};
		double[][] dp=new double[n][(n+4)/2];
		for(double[] a: dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(probability_head(coin, 0, (n+1)/2, dp));
	}
	public static double probability_head(double coin[], int i, int h, double dp[][]) {
		if(h==0) {
			return 1;
		}
		if(i==coin.length) {
			return 0;
		}
		if(dp[i][h]!=-1) {
			return dp[i][h];
		}
		double ans = coin[i]*probability_head(coin, i+1, h-1, dp)+ (1-coin[i])*probability_head(coin, i+1, h, dp);
		return dp[i][h]=ans;
	}
}
