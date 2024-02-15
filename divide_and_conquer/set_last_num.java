package divide_and_conquer;

public class set_last_num {

	public static void main(String[] args) {
		int arr[]= {5,7,2,3,8,9,1,4};
		int ind=set_sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int set_sort(int arr[],int si,int ei) {
		int item=arr[ei];
		int pi=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<=item) {
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		int temp=arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=temp;
		return pi;
	}

}
