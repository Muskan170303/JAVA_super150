package DynamicProgramming;

import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		String word1 = "intention"; 
		String word2 = "execution";
		int dp[][]=new int[word1.length()][word2.length()];
		for(int i[] : dp) {
			Arrays.fill(i, -1);
		}
		System.out.println(minoperation(word1,word2,0,0,dp));
	}
	public static int minoperation(String s1, String s2, int i, int j, int dp[][]) {
		if(s1.length()==i) {
			return s2.length()-j;
		}
		if(s2.length()==j) {
			return s1.length()-i;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans=minoperation(s1,s2,i+1,j+1,dp);
		}
		else {
			int del=minoperation(s1,s2,i+1,j,dp);
			int rep=minoperation(s1,s2,i+1,j+1,dp);
			int ins=minoperation(s1,s2,i,j+1,dp);
			ans=Math.min(del,Math.min(rep, ins))+1;
		}
		return dp[i][j]=ans;
	}

}
