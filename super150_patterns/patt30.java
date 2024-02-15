package super150_patterns;

public class patt30 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		while(row<=n) {
			int i=1;
			int val=n;
			while(i<=n) {
				System.out.print(val+" ");
				val--;
				i++;
			}
			row++;
			System.out.println();
		}

	}

}