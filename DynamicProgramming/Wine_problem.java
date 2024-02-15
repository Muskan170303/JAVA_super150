package DynamicProgramming;

public class Wine_problem {

	public static void main(String[] args) {
		int wine[]= {2, 3, 5, 1, 4};
		System.out.println(Wine(wine,0,wine.length-1,1));
		System.out.println(WineBU(wine));

	}
	public static int Wine(int wine[], int i, int j, int year) {
		if(i>j) {
			return 0;
		}
		
		int f=wine[i]*year+Wine(wine, i+1, j, year+1);
		int l=wine[j]*year+Wine(wine, i ,j-1, year+1);
		return Math.max(f, l);
	}
	
	public static int WineBU(int wine[]) {
		int dp[][]=new int[wine.length][wine.length];
		for(int i=0;i<wine.length;i++) {
			dp[i][i]=wine[i]*(wine.length);
		}
		for(int i=wine.length-1;i>=0;i--) {
			for(int j=i+1;j<wine.length;j++) {
				int f=wine[i]*(wine.length-j+i)+dp[i+1][j];
				int l=wine[j]*(wine.length-j+i)+dp[i][j-1];
				dp[i][j]=Math.max(f, l);
			}
		}
		return dp[0][wine.length-1];
	}

}
