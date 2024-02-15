package super150_patterns;

public class patt12 {
	public static void main(String args[]) {
		int n=5;
		int sp=n-1;
		int star=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2==0) {
				System.out.print("! ");}
				else {
					System.out.print("* ");
				}
				j++;
			}
			sp--;
			row++;
			star+=2;
			System.out.println();
		}
	}
}
