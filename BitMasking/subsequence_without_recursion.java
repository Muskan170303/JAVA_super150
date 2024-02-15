package BitMasking;

public class subsequence_without_recursion {

	public static void main(String[] args) {
		String s="abc";
		int n=s.length();
		for(int i=0;i<(1<<n);i++) {
			pattern(s,i);
		}

	}
	public static void pattern(String s, int i) {
		int pos=0;
		while(i>0) {
			if((i&1) == 1) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i=i>>1;
		}
		System.out.println();
	}

}
