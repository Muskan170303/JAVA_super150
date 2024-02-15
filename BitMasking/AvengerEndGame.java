package BitMasking;

public class AvengerEndGame {

	public static void main(String[] args) {
		int prime[]= {2,3,5};
		int n=1000;
		System.out.println(count(prime,n));
	}
	public static int count(int prime[], int n) {
		int len=prime.length;
		int ans=0;
		for(int i=1;i<(1<<len);i++) {
			if((countsetbit(i)&1) ==1) {
				ans+=Intersection(prime,n,i);
			}else {
				ans-=Intersection(prime,n,i);
			}
		}
		return ans;
	}
	private static int Intersection(int prime[], int n, int i) {
		int pro=1;
		int pos=0;
		while(i>0){
			if((i&1)!=0) {
				pro*=prime[pos];
			}
			pos++;
			i=i>>1;
		}
		return n/pro;
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
