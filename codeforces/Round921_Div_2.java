package codeforces;

import java.util.Scanner;

public class Round921_Div_2 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			int x=sc.nextInt();
			int n=sc.nextInt();
			int ans=0;
			for(int i=1;i<=x/2;i++) {
				ans=Math.max(ans, fun(x-i,n-1,i));
			}
			System.out.println(ans);
		}
	}
	public static int fun(int sum, int n, int gcd) {
		if(n==0 && sum==0){
			return gcd;
		}
		if(n==0 || sum==0) {
			return 1;
		}
		int ans=0;
		for(int i=1;i<=sum;i++) {
			ans=Math.max(fun(sum-i,n-1,gcd(gcd,i)),ans);
		}
		return ans;
	}
	public static int gcd(int n1,int n2) {
		int r=n1%n2;
		while(r!=0) {
			n1=n2;
			n2=r;
			r=n1%n2;
		}
		return n2;
	}
}



//	problem A

//while(t-- > 0) {
//	int n=sc.nextInt();
//	int k=sc.nextInt();
//	StringBuilder s=new StringBuilder("");
//	String ans="";
//	for(char i='a';i<'a'+k;i++) {
//		s.append(i);
//	}
//	for(int i=0;i<n;i++) {
//		if(i%2==0) {
//			ans+=s;
//		}else {
//			ans+=s.reverse();
//		}
//	}
//	System.out.println(ans);
//}
