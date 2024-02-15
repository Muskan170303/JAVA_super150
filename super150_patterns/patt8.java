package super150_patterns;

public class patt8 {
	public static void main(String args[]) {
		int n=5;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=n) {
				if(row==j || row+j-1==n) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
				j++;
			}
			row++;
			System.out.println();
		}
	}
}
