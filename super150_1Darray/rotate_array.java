package super150_1Darray;

public class rotate_array {

	public static void main(String[] args) {
		int[]arr= {1,3,6,7,2,4,5};		// 2 4 5 1 3 6 7
		int k=3;
		k=k%arr.length;
		reverse(arr,0,arr.length-k-1);
		reverse(arr,arr.length-k,arr.length-1);
		reverse(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"	");
		}
		
	}
	
	public static void reverse(int arr[],int i,int j) {
		int n=arr.length;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}