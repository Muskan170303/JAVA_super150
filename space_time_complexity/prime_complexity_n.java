package space_time_complexity;

public class prime_complexity_n {

	public static void main(String[] args) {
		int n=100;
		for(int i=2;i<n;i++) {
			if(isprime1(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		prime_sieve(n);

	}
	// complexity => O(n*n^1/2)
	public static boolean isprime1(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
			return false;
			}
			div++;
		}
		return true;
	}
	
	public static void prime_sieve(int n) {
		boolean[]prime=new boolean[n];
		prime[0]=prime[1]=true;
		for(int i=2;i<n;i++) {
			if(prime[i]==false) {
				for(int j=2;j*i<prime.length;j++) {
					prime[i*j]=true;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(prime[i]==false) {
				System.out.print(i+" ");
			}
		}
		
		
	}
	

}
