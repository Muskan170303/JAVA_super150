package MS_interview;

import java.util.Scanner;

public class round1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			arr[i]=arr[i]/100;
		}
		freehour(arr);
	}
	public static int freehour(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]>=2) {
				return i;
			}
		}
		return -1;
	}

}
