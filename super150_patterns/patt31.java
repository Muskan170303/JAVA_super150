package super150_patterns;

public class patt31 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		while(row<=n) {
			int i=1;
			int val=n;
			while(i<=n) {
				if(i==n-row+1) {
					System.out.print("* ");
				}
				else
					System.out.print(val+" ");
				val--;
				i++;
			}
			row++;
			System.out.println();
		}

	}

}