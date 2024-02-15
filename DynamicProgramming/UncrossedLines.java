package DynamicProgramming;

public class UncrossedLines {

	public static void main(String[] args) {
		int nums1[]= {1,3,7,1,7,5};
		int nums2[]= {1,9,2,5,1};
		int dp[][]=new int[nums1.length][nums2.length];
		System.out.println(LCS(nums1,nums2,0,0,dp));	
	}
	
	// TLE
	public static int LCS(int num1[], int num2[], int i, int j, int dp[][]) {
		if(i==num1.length || j==num2.length) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int ans=0;
		if (num1[i]==num2[j]){
			ans= 1+LCS(num1,num2,i+1,j+1,dp);
		}else {
			int fs=LCS(num1,num2,i,j+1,dp);
			int ss=LCS(num1,num2,i+1,j,dp);
			ans=Math.max(fs, ss);
		}
		return dp[i][j]=ans;
	}

}
