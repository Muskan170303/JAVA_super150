package super150_patterns;

public class patt28 {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=sp) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val=row;
			int terms=2*row-1;
			while(j<=terms) {				
				System.out.print(val+" ");		
				if(j<=terms/2) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			row++;
			sp--;
			System.out.println();
		}

	}

}