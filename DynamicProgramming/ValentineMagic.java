package DynamicProgramming;

import java.util.Arrays;

public class ValentineMagic {

	public static void main(String[] args) {
		int b[]= {2,11,3};
		int g[]= {5,7,3,2};
		Arrays.sort(b);
		Arrays.sort(g);
		int dp[][]=new int[b.length][g.length];
		System.out.println(valentinepairing(b,g,0,0,dp));
	}
	public static int valentinepairing(int b[], int g[], int bi, int gi, int dp[][]) {
		if(b.length==bi) {
			return 0;
		}
		if(g.length==gi) {
			return 9999999;
		}
		if(dp[bi][gi]!=0) {
			return dp[bi][gi];
		}
		int inc=Math.abs(b[bi]-g[gi])+valentinepairing(b,g,bi+1,gi+1,dp);
		int exc=valentinepairing(b,g,bi,gi+1,dp);
		return dp[bi][gi]=(Math.min(inc, exc));
	}
	
}
