package super150_patterns;

public class patt27 {
	public static void main(String args[]) {		//vertical mirroring..
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
			int val=1;
			while(j<=star) {
				System.out.print(val+" ");
				j++;
				if(j<=star/2+1) {
					val++;
				}
				else {
					val--;
				}
			}
			sp--;
			row++;
			star+=2;
			System.out.println();
		}
	}

}