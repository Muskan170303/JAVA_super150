package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{2,1,3},{6,5,4},{7,8,9}};
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
		int bott=minPath(mat,i+1,j,dp);
		int dleft=minPath(mat,i+1,j-1,dp);
		int dright=minPath(mat,i+1,j+1,dp);
		return dp[i][j]=Math.min(dright, Math.min(dleft, bott))+mat[i][j];
	}
	
//	public static int minPathBU(int mat[][]) {
//		int dp[][]=new int[mat.length][mat[0].length];
//		for(int i=mat.length-1;i>=0;i--) {
//			for(int j)
//		}
//	}

}
