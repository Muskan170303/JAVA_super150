package super150_patterns;

public class patt18 {
	public static void main(String args[]) {
		int n=7;
		int sp=n/2;
		int star=1;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=sp) {
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//mirroring(at line n/2+1)
			if(row<n/2+1) {
			sp--;
			star+=2;
			}
			else {
				sp++;
				star-=2;
			}
			row++;
			System.out.println();
		}
	}
}
