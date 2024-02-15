package super150_patterns;

public class patt21 {
	public static void main(String args[]) {
		int row=1;
		int n=5;
		int sp=2*n-3;
		int star=1;
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
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			row++;
			star++;
			sp-=2;
			System.out.println();
		}
	}
}
