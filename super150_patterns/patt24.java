package super150_patterns;

public class patt24 {
	public static void main(String[] args) {
		int n=5;
		int row=1;
		int sp=n-1;
		while(row<=n) {
			int i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=2*row-1) {
				System.out.print(row+" ");
				j++;
			}
			row++;
			sp--;
			System.out.println();
		}

	}
}