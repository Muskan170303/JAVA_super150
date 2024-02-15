package super150_patterns;

public class patt4 {
	public static void main(String args[]) {
		int n=5;
		int star=n;
		int row=1;
		int sp=0;
		while(row<=n) {
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
		row++;
		sp++;
		star--;
		System.out.println();
		}
	}

}
