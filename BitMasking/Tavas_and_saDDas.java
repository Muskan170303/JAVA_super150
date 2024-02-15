package BitMasking;

import java.util.Scanner;

public class Tavas_and_saDDas {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(index(str));
	}
	public static int index(String s) {
		int n=s.length();
		int x=(1<<n)-2;
		int y=0;
		int pos=0;
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)=='7') {
				y+=(1<<pos);
			}
			pos++;
		}
		return x+y+1;
	}

}
