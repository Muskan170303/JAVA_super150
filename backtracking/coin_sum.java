package backtracking;

public class coin_sum {

	public static void main(String[] args) {
		int arr[]= {2,3,5};
		int sum=0;
		int limit=10;
		String s="";
		int curr=0;
		coin_permutation(arr,sum,s,limit);
		System.out.println();
		coin_combination(arr,sum,s,limit,curr);
	}
	public static void coin_permutation(int arr[],int sum,String s,int limit) {
		if(sum==limit) {
			System.out.print(s+" ");
			return;
		}
		if(sum>limit) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			coin_permutation(arr,sum+arr[i],s+arr[i],limit);
		}
	}
	public static void coin_combination(int arr[],int sum,String s,int limit,int curr) {
		if(sum==limit) {
			System.out.print(s+" ");
			return;
		}
		if(sum>limit) {
			return;
		}
		for(int i=curr;i<arr.length;i++) {
			coin_combination(arr,sum+arr[i],s+arr[i],limit,curr+i);
		}
	}

}
