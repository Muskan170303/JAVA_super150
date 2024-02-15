package super150_1Darray;

public class reverse_array {

	public static void main(String[] args) {
		int[]arr= {1,3,1,3,2,4,422,-99};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"	");
		}
		
	}
	public static void reverse(int arr[]) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}