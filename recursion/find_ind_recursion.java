package recursion;

public class find_ind_recursion {

	public static void main(String[] args) {
		int arr[]= {2,3,7,2,3,7,2,3,4,6,8};
		int item=7;
		System.out.println(for_index(arr,item,0));
		System.out.println(back_index(arr,item,arr.length-1));
	}
	public static int for_index(int arr[],int item,int i) {
		// base case
		if(i==arr.length) {
			return -1;
		}
		//recursive call
		if(arr[i]==item) {
			return(i);
		}
		return for_index(arr,item,i+1);
	}
	public static int back_index(int arr[],int item,int i) {
		// base case
		if(i==-1) {
			return -1;
		}
		//recursive call
		if(arr[i]==item) {
			return(i);
		}
		return back_index(arr,item,i-1);
	}

}
