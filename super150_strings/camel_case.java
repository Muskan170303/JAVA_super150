package super150_strings;

import java.util.Scanner;

public class camel_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int j=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=91) {
				System.out.println(s.substring(j,i));
				j=i;
			}
		}
		System.out.println(s.substring(j));
	}

}
