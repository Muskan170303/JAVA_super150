package DynamicProgramming;

import java.util.Arrays;

public class DistinctSubsequences {

	public static void main(String[] args) {
		String s="rabbbit";
		String t="rabbit";
//		int dp[]=new int[t.length()];
//		Arrays.fill(dp, -1);
		System.out.println(subsequence(s,t,0,0));
//		System.out.println(subsequence(s,t,0,0,dp));
	}
	public static int subsequence(String s, String t, int is, int it) {
		if(it==t.length()) {
			return 1;
		}
		if(is==s.length()) {
			return 0;
		}
		int inc=0, exc=0;
		if(s.charAt(is)==t.charAt(it)) {
			inc=subsequence(s,t,is+1,it+1);
		}
		exc=subsequence(s,t,is+1,it);
		return inc+exc;
	}
//	public static int subsequence(String s, String t, int is, int it, int dp[]) {
//		if(it==t.length()) {
//			return 1;
//		}
//		if(is==s.length()) {
//			return 0;
//		}
//		if(dp[it]!=-1) {
//			return dp[it];
//		}
//		int inc=0, exc=0;
//		if(s.charAt(is)==t.charAt(it)) {
//			inc=subsequence(s,t,is+1,it+1,dp);
//		}
//		exc=subsequence(s,t,is+1,it,dp);
//		return dp[it]=inc+exc;
//	}

}
