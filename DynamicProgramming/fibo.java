package DynamicProgramming;

public class fibo {

	public static void main(String[] args) {
		int n=5;
		int arr[]=new int[n+1];
		System.out.println(fibonacci(n));
		System.out.println(fibonacciTD(n,arr));
		System.out.println(fibonacciBU(n));
	}
	
//	time complexity => O(2^n)
//	space complexity => O(1)
	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int a=fibonacci(n-1);
		int b=fibonacci(n-2);
		return a+b;
	}
	
//	time complexity => O(n)
//	space complexity => O(n)
	public static int fibonacciTD(int n, int dp[]) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int a=fibonacciTD(n-1,dp);
		int b=fibonacciTD(n-2,dp);
		return dp[n]=a+b;	// memorizing data and returning simultaneously
	}
	
//	time complexity => O(n)
//	space complexity => O(n)
	public static int fibonacciBU(int n) {
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
