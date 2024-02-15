package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Round898_Div_4 {

	// A. short sort
	
//	public static boolean equals(String str) {
//		int ind[][]={{0,1},{0,2},{1,2}};
//		for(int i=0;i<ind.length;i++) {
//			char arr[]=str.toCharArray();
//			char temp=arr[ind[i][0]];
//			arr[ind[i][0]]=arr[ind[i][1]];
//			arr[ind[i][1]]=temp;
//			String s=String.valueOf(arr);
//			if(s.equals("abc")) {
//				return true;
//			}
//		}
//		return false;
//	}
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int tc=sc.nextInt();
//		
//		for(int t=0;t<tc;t++) {
//			String s=sc.next();
//			if(s.equals("abc")) {
//				System.out.println("yes");
//			}
//			else {
//				if(equals(s)) {
//					System.out.println("yes");
//				}
//				else {
//					System.out.println("no");
//				}
//			}
//		}
//		
//	}
	
	// B. Good Kid
	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int tc=sc.nextInt();
//		for(int t=0;t<tc;t++) {
//			int n=sc.nextInt();
//			int arr[]=new int[n];
//			int pro=1;
//			for(int i=0;i<n;i++) {
//				arr[i]=sc.nextInt();
//			}
//			Arrays.sort(arr);
//			arr[0]=arr[0]+1;
//			for(int i=0;i<n;i++) {
//				pro=pro*arr[i];
//			}
//			System.out.println(pro);
//		}
//	}
	
	
	// C. Target Practice
	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int tc=sc.nextInt();
//		for(int t=0;t<tc;t++) {
//			int points=0;
//			for(int i=1;i<=10;i++) {
//				char arr[]=sc.next().toCharArray();
//				for(int j=1;j<=arr.length;j++) {
//					if(arr[j-1]=='X') {
//						if(i==1 || i==10 || j==1 || j==10) {
//							points+=1;
//						}
//						else if(i==2 || i==9 || j==2 || j==9) {
//							points+=2;
//						}
//						else if(i==3 || i==8 || j==3 || j==8) {
//							points+=3;
//						}
//						else if(i==4 || i==7 || j==4 || j==7) {
//							points+=4;
//						}
//						else if(i==5 || i==6 || j==5 || j==6) {
//							points+=5;
//						}
//					}
//					
//				}
//			}
//			System.out.println(points);
//		}
//		
//	}
	
	// E. Building an Aquarium
	// not optimized- time limit error
	
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int tc=sc.nextInt();
//		for(int t=0;t<tc;t++) {
//			int n=sc.nextInt();
//			int x=sc.nextInt();
//			int arr[]= new int[n];
//			for(int i=0;i<n;i++) {
//				arr[i]=sc.nextInt();
//			}
//
//			int h=0;
//			int sum=0;
//			while(h*n-sum<=x) {
//				for(int i=0;i<n;i++) {
//					if(arr[i]>=h) {
//						sum+=1;
//					}
//				}
//				h++;
//			}
//			System.out.println(h-2);
//		}
//	}
	
	// F. Money Trees
	// not correct
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc=sc.nextInt();
		for(int t=0;t<tc;t++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int fru[]=new int[n];
			int h[]=new int[n];
			boolean isdiv[]=new boolean[n];
			for(int i=0;i<n;i++) {
				fru[i]=sc.nextInt();
			}
			h[0]=sc.nextInt();
			for(int i=1;i<n;i++) {
				h[i]=sc.nextInt();
				if(h[i-1]%h[i]==0) {
					isdiv[i-1]=true;
				}
			}
			
			int l=0;
			int i=0;
			while(i<n) {
				int sum=0;
				int temp=i;
				if(isdiv[i] && sum<=k) {
					sum+=fru[i];
					l=Math.max(l, i-temp+1);
					i++;
				}
				i++;
			}
			System.out.println(l);
		}
	}
	

}
