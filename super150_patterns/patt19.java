package super150_patterns;

public class patt19 {
	public static void main(String args[]) {
		int n=7;
		int sp=-1;
		int star=n/2+1;
		int row=1;
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
			if(row==1 || row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			//mirroring(at line n/2+1)
			if(row<n/2+1) {
			sp+=2;
			star--;
			}
			else {
				sp-=2;
				star++;
			}
			row++;
			System.out.println();
		}
	}

}
