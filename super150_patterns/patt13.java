package super150_patterns;

public class patt13 {
	public static void main(String args[]) {
		int n=5;
		int star=1;
		int row=1;
		while(row<=2*n-1) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
		}
		row++;
		if(row<n) {
		star++;}
		else {
			star--;
		}
		System.out.println();
		}
	}
}
