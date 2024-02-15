package super150_patterns;

public class patt7 {
	public static void main(String args[]) {
		int n=5;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=n) {
				if(row==1 || row==n) {
					System.out.print("* ");
				}
				else if(j==1 || j==n) {
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
