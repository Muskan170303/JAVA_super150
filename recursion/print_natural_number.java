package recursion;

public class print_natural_number {

	public static void main(String[] args) {
		int n=5;
		natural(n);

	}
	public static void natural(int n) {
//	for: 1 2 3 4 5	(head recursion)
		if(n==0) {
			return;
		}
		natural(n-1);
		System.out.print(n+" "); 
		
//	for: 5 4 3 2 1	(tail recursion)
//		if(n==0) {
//			return;
//		}
//		System.out.print(n+" ");
//		natural(n-1);	
	}

}
