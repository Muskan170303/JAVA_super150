package BitMasking;

public class setBit {

	public static void main(String args[]) {
		int n=67;
		System.out.println(count(n));
		System.out.println(count2(n));
	}
	public static int count(int n) {
		int ans=0;
		while(n>0) {
			if((n&1)!=0) {
				ans++;
			}
			n=n>>1;
		}
		return ans;
	}
	public static int count2(int n) {
		int ans=0;
		while(n>0) {
			n=n&(n-1);
			ans++;
		}
		return ans;
	}
}
