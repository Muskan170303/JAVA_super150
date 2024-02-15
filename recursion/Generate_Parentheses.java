package recursion;


public class Generate_Parentheses {

	public static void main(String[] args) {
		int n=3;
//		int sum=0;
		String s="";
		int open=0;
		int close=0;
//		add_Parentheses(2*n,sum,s);
		add_Parentheses(n,s,open,close);

	}
	public static void add_Parentheses(int n,String s,int open,int close) {
		if(open==n && close==n) {
			System.out.println(s+" ");
			return;
		}
		
		if(open<n)
		add_Parentheses(n,s+"(",open+1,close);
		if(close<open)
		add_Parentheses(n,s+")",open,close+1);
	}
	
//	my approach(not correct)
//	public static void add_Parentheses(int n,int sum, String s) {
//		if(n==0) {
//			if(sum==0) {
//			System.out.println(s);
//			return;
//			}
//		}
//		if(sum<=0 || sum>3) {
//			return;
//		}
//		
//		if(sum<3)
//		add_Parentheses(n-1,sum+1,s+"(");
//		if(sum>0)
//		add_Parentheses(n-1,sum-1,s+")");
//	}
	
}
