package codeforces;

import java.util.*;

public class Round919_Div_2 {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			int ans=Integer.MIN_VALUE;
			for(int i=0;i<=x;i++) {
				int sum=0;
				for(int j=n-i-1;j>=n-i-y && j>=0;j--) {
					sum+=-arr[j];
				}
				for(int j=n-i-y-1;j>=0;j--) {
					sum+=arr[j];
				}
				if(sum>=ans) {
					ans=sum;
				}
			}
			System.out.println(ans);
		}
	}

}

//public static void main(String[] args) {
//Scanner sc= new Scanner(System.in);
//int t=sc.nextInt();
//while(t-- > 0) {
//	int n=sc.nextInt();
//	int count=0;
//	PriorityQueue<Integer> pq= new PriorityQueue<>();
//	int li=0;
//	int hi=Integer.MAX_VALUE;
//	for(int i=0;i<n;i++) {
//		int a=sc.nextInt();
//		if(a==1) {
//			int x=sc.nextInt();
//			if(li<x) {
//				li=x;
//				count=hi-li+1;
//			}
//		}else if(a==2) {
//			int x=sc.nextInt();
//			if(hi>x) {
//				hi=x;
//				count=hi-li+1;
//			}
//		}else {
//			pq.add(sc.nextInt());
//		}
//	}
//	if(count>0) {
//		while(!pq.isEmpty() && pq.peek()<li) {
//			pq.poll();
//		}
//		while(!pq.isEmpty() && pq.peek()<=hi) {
//			count--;
//			pq.poll();
//		}
//		System.out.println(count);
//	}else {
//		System.out.println(0);
//	}
//	
//}
//}
