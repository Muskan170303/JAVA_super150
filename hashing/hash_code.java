package hashing;

public class hash_code {

	public static void main(String[] args) {
		String str="APPLE";
		System.out.println(hashcode(str));

	}
	public static long hashcode(String str) {
		long pow=1;
		long mod=1000_000_007;
		long p=31;
		long hv=0;
		for(int i=0;i<str.length();i++) {
			int pos=str.charAt(i)-'A'+1;
			hv=(hv+(pos*pow)%mod)%mod;
			pow=(pow*p)%mod;
		}
		return hv;
	}

}
