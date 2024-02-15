package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
		int dp[][]=new int[grid.length][grid[0].length];
		for (int i[] : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(minPath(grid,0,0,dp));
	}
	public static int minPath(int grid[][],int i,int j, int dp[][]) {
		if(i==grid.length-1 && j==grid[0].length-1) {
			return grid[i][j];
		}
		if(i>=grid.length || j>=grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ver=minPath(grid,i+1,j,dp);
		int hor=minPath(grid,i,j+1,dp);
		return dp[i][j]=Math.min(ver, hor)+grid[i][j];
	}

}
