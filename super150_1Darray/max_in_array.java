package super150_1Darray;

public class max_in_array {
	public static void main(String args[]) {
		int arr[]= {1,3,1,3,2,4,422,-99};
		System.out.println(max(arr));
	}
	public static int max(int arr[]) {
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return(max);
	}

}