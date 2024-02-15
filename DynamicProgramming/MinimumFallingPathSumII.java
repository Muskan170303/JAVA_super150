package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSumII {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int minsum=Integer.MAX_VALUE;
		int dp[][]=new int[matrix.length][matrix[0].length];
		for (int i[] : dp) {
			Arrays.fill(i, -1000);
		}
		for(int i=0;i<matrix.length;i++) {
			minsum=Math.min(minsum, minPath(matrix,0,i,dp));
		}
		System.out.println(minsum);
	}
	public static int minPath(int mat[][], int i, int j, int dp[][]) {
		if(i>=mat.length || j>=mat[0].length || j<0) {
			return Integer.MAX_VALUE;
		}
		if(i==mat.length-1) {
			return mat[i][j];
		}
		if(dp[i][j]!=-1000) {
			return dp[i][j];
		}
		int sum=Integer.MAX_VALUE;
		for(int col=0;col<mat[0].length;col++) {
			if (j!=col)
			sum=Math.min(sum, minPath(mat,i+1,col,dp));
		}
		return dp[i][j]=sum+mat[i][j];
	}

}
