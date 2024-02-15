package recursion;

public class fact {
	static int f=1;
	public static void main(String[] args) {
		int n=5;
		int ans=1;
		System.out.println(fact_head(n));
		System.out.println(fact_tail(n));
		System.out.println(factorial(n,ans));

	}
// 	head recursion
	public static int fact_head(int n) {
		if(n==0) {
			return(1);
		}
		return(n*fact_head(n-1));	
	}
//	tail recursion
//		my method:
	public static int fact_tail(int n) {
		if(n==0) {
			return(f);
		}
		f*=n;
		return(fact_tail(n-1));
	}
		
//		monu sir's method:
	public static int factorial(int n,int ans) {
		if(n==0) {
			return(ans);
		}
		return(factorial(n-1,ans*n));
	}
	
}

