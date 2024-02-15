package codeforces;

import java.util.*;

public class Hello2024 {

//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int t=sc.nextInt();
//		while( t-->0) {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			if(Math.abs(a-b)%2==0) {
//				System.out.println("Bob");
//			}else {
//				System.out.println("Alice");
//			}
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int plus=0;
			int minus=0;
			int l=sc.nextInt();
			String s=sc.next();
			for(int i=0;i<l;i++) {
				if(s.charAt(i)=='+') {
					plus++;
				}else {
					minus++;
				}
			}
			System.out.println(Math.abs(plus-minus));
		}
		
	}

}
