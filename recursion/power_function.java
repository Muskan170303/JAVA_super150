package recursion;

public class power_function {
	public static void main(String args[]) {
		int a=2;
		int b=4;
		int ans_tail=1;
		int ans_head=1;
		ans_tail=powerfn_tail(a,b,1); // tail recursion
		ans_head=powerfn_head(a,b);	//head recursion
		System.out.println(ans_tail);
		System.out.println(ans_head);
	}
	

//	tail recursion
	public static int powerfn_tail(int m,int n,int ans) {
		if(n==0) {
			return(ans);
		}
		ans*=m;
		
		return(powerfn_tail(m,n-1,ans));
	}

//	head recursion
	public static int powerfn_head(int m,int n) {
		if(n==0) {
			return 1;
		}
		return(m*powerfn_head(m,n-1));
	}
}
