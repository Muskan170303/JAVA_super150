package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int nums[] = {10,9,2,5,3,7,101,18};
		System.out.println(LIS(nums));
	}
	public static int LIS(int nums[]) {
		int dp[]=new int[nums.length];
		Arrays.fill(dp,1);
		for(int i=1;i<nums.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(nums[i]>nums[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max=dp[0];
		for(int i=1;i<dp.length;i++) {
			if(max<dp[i]) {
				max=dp[i];
			}
		}
		return max;
	}

}
