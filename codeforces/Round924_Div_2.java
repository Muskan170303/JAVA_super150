package codeforces;

import java.util.*;

public class Round924_Div_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int l=sc.nextInt();
			int b=sc.nextInt();
			if(l%2==0) {
				if(l/2!=b && b*2!=l){
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
			else if(b%2==0) {
				if(b/2!=l && l*2!=b){
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else {
				System.out.println("no");
			}
		}

	}

}
//Problem A
//



//Problem B
//int n=sc.nextInt();
//int arr[]=new int[n];
//for(int i=0;i<n;i++) {
//	arr[i]=sc.nextInt();
//}
//Arrays.sort(arr);
//int ans=1;
//int c=1;
//for(int i=0;i<n-1;i++) {
//	if(arr[i+1]-arr[i]==1) {
//		c++;
//		ans=Math.max(ans, c);
//	}
//	else {
//		c=1;
//	}
//}
//System.out.println(ans);

//Problem C
//int n=sc.nextInt();
//int x=sc.nextInt();
//int c=0;
//HashSet<Integer> visited=new HashSet<>();
//for(int i=2;i<n-x;i++) {
//	if((n-x)%i==0 && !visited.contains((n-x)/i)) {
//		c++;
//		visited.add((n-x)/i);
//	}
//	if((n+x)%i==0 && !visited.contains((n+x)/i)) {
//		c++;
//		visited.add((n+x)/i);
//	}
//}
//System.out.println(c);
