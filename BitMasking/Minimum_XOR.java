package BitMasking;

public class Minimum_XOR {

	public static void main(String args[]) {
		
		int a=11;
		int b=125;
		int x=0;
		int c=countset(b);
		for(int i=31;i>=0;i--) {
			if((a&(1<<i))!=0) {
				x+=(1<<i);
				c--;
			}
		}
		for(int i=0;i<=31 && c>0;i++) {
			if((a&(1<<i))==0) {
				x+=(1<<i);
				c--;
			}
		}
		System.out.println(x);
	}
	public static int countset(int b) {
		int c=0;
		while(b!=0) {
			b=b&(b-1);
			c++;
		}
		return c;
	} 
}
