package hashing;

import java.util.*;

public class PatternFind {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			String s=sc.next();
			String patt=sc.next();
			
		
			hashcode(s,patt);
			//sc.nextLine();
//			System.out.println();
		}

	}
	public static void hashcode(String str,String patt) {
		long pow=1;
		long mod=1000_000_007;
		long p=31;
		long hv=0;
		for(int i=0;i<patt.length();i++) {
			int pos=patt.charAt(i)-'a'+1;
			hv=(hv+(pos*pow)%mod)%mod;
			pow=(pow*p)%mod;
		}
		long dp[]=new long[str.length()];
		long pa[]=new long[str.length()];
		dp[0]=str.charAt(0)-'a'+1;
		pa[0]=1;
		pow=31;
		for(int i=1;i<str.length();i++) {
			dp[i]=(dp[i-1]+((str.charAt(i)-'a'+1)*pow)%mod)%mod;
			pa[i]=pow;
			pow=(pow*p)%mod;
		}
		List <Integer> ll=new ArrayList<>();
		for(int ei=patt.length()-1,si=0;ei<str.length();si++,ei++) {
			long curr=dp[ei];
			if(si>0) {
				curr-=dp[si-1];
				curr=(curr+mod)%mod;
			}
			if(curr==(hv*pa[si])%mod) {
				ll.add(si+1);
			}
		}
		if(ll.size()==0) {
			System.out.println("Not Found");
		}else {
			System.out.println(ll.size());
			for(int num:ll) {
				System.out.print(num+" ");
			}
		}
		
	}

}
