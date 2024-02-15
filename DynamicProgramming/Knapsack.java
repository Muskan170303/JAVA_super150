package DynamicProgramming;

import java.util.Arrays;

public class Knapsack {

	public static void main(String[] args) {
		int n=5;
		int cap=4;
		int wt[]={1,2,3,2,2};
		int val[]={8,4,0,5,3};
		System.out.println(knapsack(wt,val,cap,0));
		int dp[][]=new int[cap+1][wt.length];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(knapsackTD(wt,val,cap,0,dp));
		
	}
	public static int knapsack(int wt[], int val[], int cap, int ind) {
		if(ind==wt.length || cap==0) {
			return 0;
		}
		
		int inc=0;
		if(cap>=wt[ind]) {
			inc=val[ind]+knapsack(wt, val, cap-wt[ind], ind+1);
		}
		int exc=knapsack(wt, val, cap, ind+1);
		return Math.max(inc, exc);
	}
	
	public static int knapsackTD(int wt[], int val[], int cap, int ind, int dp[][]) {
		if(ind==wt.length || cap==0) {
			return 0;
		}
		if(dp[cap][ind]!=-1) {
			return dp[cap][ind];
		}
		int inc=0;
		if(cap>=wt[ind]) {
			inc=val[ind]+knapsackTD(wt, val, cap-wt[ind], ind+1,dp);
		}
		int exc=knapsackTD(wt, val, cap, ind+1,dp);
		return dp[cap][ind]=Math.max(inc, exc);
	}

}
