package recursion;

public class coin_toss {

	public static void main(String[] args) {
		int n=3;
		String ans="";
		toss(n,ans);
		System.out.println(count_toss(n,ans));
		System.out.println();
		// toss possibility without any consecutive H
		toss_h(n,ans);
		System.out.println(count_toss_h(n,ans));
		
	}
	public static void toss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		toss(n-1,ans+'H');
		toss(n-1,ans+'T');
	}
	public static void toss_h(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(ans=="" || ans.charAt(ans.length()-1)!='H')
			toss_h(n-1,ans+'H');
		toss_h(n-1,ans+'T');
	}
	public static int count_toss(int n,String ans) {
		if(n==0) {
			return 1;
		}
		int p=count_toss(n-1,ans+'H');
		int q=count_toss(n-1,ans+'T');
		return p+q;
	}
	public static int count_toss_h(int n,String ans) {
		if(n==0) {
			return 1;
		}
		int p=0;
		if(ans=="" || ans.charAt(ans.length()-1)!='H')
			p=count_toss_h(n-1,ans+'H');
		int q=count_toss_h(n-1,ans+'T');
		return p+q;
	}
}
