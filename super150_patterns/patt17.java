package super150_patterns;

public class patt17 {
	public static void main(String args[]) {
		int n=7;
		int row=1;
		int sp=1;
		int star=n/2;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=sp) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(row<n/2+1) {
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
