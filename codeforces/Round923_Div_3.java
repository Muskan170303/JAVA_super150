package codeforces;

import java.util.*;

public class Round923_Div_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			
			HashSet<Integer> set1=new HashSet<>();
			HashSet<Integer> set2=new HashSet<>();
			int c1=0;
			int c2=0;
			boolean ans=false;
			for(int i=0;i<n;i++) {
				set1.add(sc.nextInt());
			}
			for(int i=0;i<m;i++) {
				set2.add(sc.nextInt());
			}
			for(int i=1;i<=k;i++) {
				if(c1<k/2 && set1.contains(i)) {
					c1++;
				}else if(c2<k/2 && set2.contains(i)){
					c2++;
				}else {
					System.out.println("no");
					ans=true;
					break;
				}
			}
			if(ans==false) {
				System.out.println("yes");
			}
			
//			int a[]=new int[n];
//			int b[]=new int[n];
//			for(int i=0;i<n;i++) {
//				a[i]=sc.nextInt();
//			}
//			for(int i=0;i<n;i++) {
//				b[i]=sc.nextInt();
//			}
//			Arrays.sort(a);
//			Arrays.sort(b);
//			if(a[(k/2)-1]<=k && b[(k/2)-1]<=k) {
//				System.out.println("yes");
//			}else {
//				System.out.println("no");
//			}
		}

	}

}

//Problem A

//int n=sc.nextInt();
//String s=sc.next();
//int len=0;
//for(int i=n-1;i>=0;i--) {
//	if(s.charAt(i)=='B') {
//		len=i;
//		break;
//	}
//}
//for(int i=0;i<=len;i++) {
//	if(s.charAt(i)=='B') {
//		len=len-i+1;
//		break;
//	}
//}
//System.out.println(len);

//Problem B

//int n=sc.nextInt();
//int fq[]=new int[26];
//String s="";
//for(int i=0;i<n;i++) {
//	int x=sc.nextInt();
//	for(int j=0;j<26;j++) {
//		if(fq[j]==x) {
//			s+=(char)(j+97);
//			fq[j]++;
//			break;
//		}
//	}
//}
//System.out.println(s);
//
