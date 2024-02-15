package super150_patterns;

public class patt15 {
	public static void main(String args[]) {
		int n=5;
		int sp=0;
		int star=n;
		int row=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//mirroring
			if(row<n) {
			sp+=2;
			star--;
			}
			else {
				sp-=2;
				star++;
			}
			row++;
			System.out.println();
		}
	}

}
