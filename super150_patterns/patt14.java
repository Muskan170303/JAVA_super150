package super150_patterns;

public class patt14 {
	public static void main(String args[]) {
		int n=5;
		int star=1;
		int row=1;
		int sp=n-1;
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
		row++;
		if(row<n) {
		sp--;
		star++;}
		else {
			sp++;
			star--;
		}
		System.out.println();
		}
	}
}
