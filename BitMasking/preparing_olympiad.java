package BitMasking;

import java.util.Scanner;

public class preparing_olympiad {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
		}
		System.out.println(count(c,l,r,x));

	}
	public static int count(int c[], int l, int r, int x) {
		int n=c.length;
		int count=0;
		for(int i=3;i<(1<<n);i++) {
			if(countsetbit(i)>=2 && ispossible(c,i,l,r,x)) {
				count++;
			}
		}
		return count;
	}
	public static boolean ispossible(int[] c, int i, int l, int r, int x) {
		long sum=0;
		int pos=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(i>0) {
			if((i&1) == 1) {
				sum+=c[pos];
				min=Math.min(min, c[pos]);
				max=Math.min(max, c[pos]);
			}
			pos++;
			i=i>>1;
		}
		return sum>=l & sum<=r & max-min>=x;
	
	}
	public static int countsetbit(int n) {
		int ans=0;
		while(n>0) {
			n=n&(n-1);
			ans++;
		}
		return ans;
	}

}
