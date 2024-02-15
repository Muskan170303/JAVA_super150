package divide_and_conquer;

public class quick_sort {

	public static void main(String[] args) {
		int arr[]= {5,7,2,3,8,9,1,4};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void quicksort(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pi=set_sort(arr,si,ei);
		quicksort(arr,si,pi-1);
		quicksort(arr,pi+1,ei);
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
