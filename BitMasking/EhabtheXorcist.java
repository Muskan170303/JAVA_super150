package BitMasking;

import java.util.Scanner;

public class EhabtheXorcist {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long u=sc.nextLong();
		long v=sc.nextLong();
		if(u>v || (v-u)%2!=0) {
			System.out.println(-1);
		}else if(v==u) {
			if(u==0) {
				System.out.println(0);
			}else {
				System.out.println(1);
				System.out.println(u);
			}
		}else {
			long x=(v-u)/2;
			if((u&x)==0) {
				System.out.println(2);
				System.out.println(u+x+" "+x);
			}else {
				System.out.println(3);
				System.out.println(u+" "+x+" "+x);
			}
		}
	}

}
