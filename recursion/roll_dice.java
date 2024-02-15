package recursion;

public class roll_dice {

	public static void main(String[] args) {
		int n=3;	// a dice with 3 faces => 1,2,3
		String s="";
		int des=4;	// to roll dice till it reach a sum=4
		int sum=0;
		roll_nth(n,des,s,sum);
	}
	public static void roll_nth(int n,int des,String s,int sum) {
		if(sum==des) {
			System.out.print(s+" ");
			return;
		}
		if(sum>des) {
			return;
		}
		for(int i=1;i<=n;i++) {
			roll_nth(n,des,s+i,sum+i);
		}
	}

}
