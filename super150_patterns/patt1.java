package super150_patterns;

public class patt1 {
	public static void main(String args[]) {
		int n=5;
		int star=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
	}

}
