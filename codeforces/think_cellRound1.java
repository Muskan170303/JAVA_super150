package codeforces;

import java.util.*;

public class think_cellRound1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		while(t-- > 0) {
			int n=sc.nextInt();
			PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
			for(int i=0;i<n;i++) {
				int a=sc.nextInt();
				if(!pq.contains(a+i+1)) {
					pq.add(a+i+1);
				}
			}
			while(!pq.isEmpty()) {
				System.out.print(pq.poll()+" ");
			}
			System.out.println();
		}
	}

}

//Problem A

//int n=sc.nextInt();
//int arr[]=new int[n*2];
//for(int i=0;i<2*n;i++) {
//	arr[i]=sc.nextInt();
//}
//Arrays.sort(arr);
//int score=0;
//int si=0;
//int ei=arr.length-1;
//while(si<ei) {
//	score+=Math.min(arr[si], arr[ei]);
//	si++;
//	ei--;
//}
//System.out.println(score);
