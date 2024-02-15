package codeforces;

import java.util.*;

class pair{
	int si;
	int ei;
	public pair(int si, int ei){
		this.si=si;
		this.ei=ei;
	}
}

public class Round918_Div_4 {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0) {
			int n=sc.nextInt();
			pair arr[]=new pair[n];
			PriorityQueue<pair> pq=new PriorityQueue<>(new Comparator<>() {
				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.ei-o2.ei;
				}
			});
			for(int i=0;i<n;i++) {
				int si=sc.nextInt();
				int ei=sc.nextInt();
				arr[i]=new pair(si,ei);
				arr[i].si=si;
				arr[i].ei=ei;
				pq.add(new pair(si,ei));
			}
			int count=0;
			for(int i=n-1;i>=0;i--) {
				for(int j=i-1;j>=0;j--) {
					if(arr[j].si>=arr[i].si) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
}




//public static void main(String[] args) {
//// TODO Auto-generated method stub
//Scanner sc= new Scanner(System.in);
//int t=sc.nextInt();
//while(t-- > 0) {
//	int a=sc.nextInt();
//	int b=sc.nextInt();
//	int c=sc.nextInt();
//	if(a==b) {
//		System.out.println(c);
//	}else if(a==c) {
//		System.out.println(b);
//	}else {
//		System.out.println(a);
//	}
//}
//
//}

//  public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-- > 0) {
//		String square[][]=new String[3][3];
//		int posx=0;
//		for(int i=0;i<3;i++) {
//			square[i]=(sc.next()).split("");
//			for(int j=0;j<3;j++) {
//				if(square[i][j].equals("?")) {
//					posx=i;
//				}
//			}
//		}
//		boolean ans[]=new boolean[3];
//		for(int i=0;i<3;i++) {
//			if(square[posx][i].equals("A")) {
//				ans[0]=true;
//			}else if(square[posx][i].equals("B")){
//				ans[1]=true;
//			}else if(square[posx][i].equals("C")){
//				ans[2]=true;
//			}
//		}
//		if(ans[0]==false) {
//			System.out.println("A");
//		}else if(ans[1]==false) {
//			System.out.println("B");
//		}else {
//			System.out.println("C");
//		}
//	}
//	
//}

//public static void main(String args[]) {
//	Scanner sc= new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-- > 0) {
//		int n=sc.nextInt();
//		long sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=sc.nextInt();
//		}
//		if(Math.sqrt(sum)%1.0==0) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//	}
//}


//public static void main(String args[]) {
//	Scanner sc= new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-- >0) {
//		int n=sc.nextInt();
//		String s=sc.next();
//		int ind=0;
//		while(ind<s.length()-3) {
//			if(s.charAt(ind+3)=='b' || s.charAt(ind+3)=='c' || s.charAt(ind+3)=='d'){
//				System.out.print(s.substring(ind,ind+3));
//				ind+=3;
//			}else{
//				System.out.print(s.substring(ind,ind+2));
//				ind+=2;
//			}
//			System.out.print(".");
//		}
//		System.out.println(s.substring(ind));
//	}
//}


//public static void main(String args[]) {
//Scanner sc= new Scanner(System.in);
//int t=sc.nextInt();
//while(t-- > 0) {
//	int n=sc.nextInt();
//	int l[]=new int[n];
//	for(int i=0;i<n;i++) {
//		if(i%2==0) {
//			l[i]=sc.nextInt();
//		}else {
//			l[i]=-sc.nextInt();
//		}
//	}
//	int ans=-1;
//	for(int i=0;i<n-1;i++) {
//		if(isequal(l,i)) {
//			System.out.println("yes");
//			ans=1;
//			break;
//		}
//	}
//	if(ans==-1)
//	System.out.println("no");
//}
//}
//
//public static boolean isequal(int arr[], int i) {
//int sum=arr[i];
//for(int k=i+1;k<arr.length;k++) {
//	sum+=arr[k];
//	if(sum==0) {
//		return true;
//	}
//}
//return false;
//}

