package codeforces;

import java.util.*;

public class Round920_Div_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			int n=sc.nextInt();
			int f=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int past=sc.nextInt();
			f-=Math.min(a*past, b);
			for(int i=1;i<n;i++) {
				int time=sc.nextInt();
				if(time-past==1) {
					f-=a;
				}else {
					f-=Math.min(b, (a*(time-past))%Math.pow(10, 9));
				}
				past=time;
			}
			if(f>0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}

//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-- >0) {
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		int dis[]=new int[3];
//		for(int i=0;i<3;i++) {
//			int x2=sc.nextInt();
//			int y2=sc.nextInt();
//			dis[i]=(int)Math.sqrt(Math.pow(Math.abs(x2-x), 2)+Math.pow(Math.abs(y2-y), 2));
//		}
//		Arrays.sort(dis);
//		System.out.println(dis[0]*dis[0]);
//	}
//}


//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-- >0) {
//		int n=sc.nextInt();
//		String s1=sc.next();
//		String s2=sc.next();
//		int c1=0;
//		int c2=0;
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)!=s2.charAt(i)) {
//				if(s1.charAt(i)=='1') {
//					c1++;
//				}else {
//					c2++;
//				}
//			}
//		}
//		if(c1!=c2) {
//			System.out.println(Math.max(c1, c2));
//		}else {
//			System.out.println(c1);
//		}
//	}
//}
