package recursion;

public class all_subsequence {
	static int c=0;
	public static void main(String[] args) {
		String s="abc";
		String ans="";
		subsequence(s,ans);
		System.out.println("\n" + count_subsequence(s,ans));
		System.out.println(c);

	}
	public static void subsequence(String s,String ans) {
		//base case
		if(s.length()==0) {
			System.out.print(ans+" ");
			c++;
			return;
		}
		char ch=s.charAt(0);
		//recursive call
		subsequence(s.substring(1),ans);
		subsequence(s.substring(1),ans+ch);
	}
	public static int count_subsequence(String s,String ans) {
		//base case
		if(s.length()==0) {
			return 1;
		}
		char ch=s.charAt(0);
		//recursive call
		int a=count_subsequence(s.substring(1),ans);
		int b=count_subsequence(s.substring(1),ans+ch);
		return a+b;
	}
}
