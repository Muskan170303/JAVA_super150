package hashing;

import java.util.Scanner;

public class ANeedleInHaystack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n=sc.nextInt();
			String patt=sc.next();
			String str=sc.next();
			KMP(patt,str);
		}
	}
	
	public static void KMP(String patt, String str) {
		String s=patt+"#"+str;
		int arr[]=new int[s.length()];
		int len=0;
		for(int i=1;i<arr.length;) {
			if(s.charAt(i)==s.charAt(len)) {
				len++;
				arr[i]=len;
				i++;
			}else {
				if(len>0) {
					len=arr[len-1];
					
				}else {
					i++;
				}
			}
		}
		for(int j=patt.length();j<arr.length;j++) {
			if(arr[j]==patt.length()) {
				System.out.println(j-2*patt.length());
			}
		}
		System.out.println();
		
	}

}
