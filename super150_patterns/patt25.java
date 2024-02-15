package super150_patterns;

public class patt25 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int sp=n-1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=sp) {
				System.out.print(" "+"	");
				i++;
			}
			int j=1;
			while(j<=2*row-1) {
				System.out.print(val+"	");
				j++;
				val++;
			}
			row++;
			sp--;
			System.out.println();
		}

	}

}