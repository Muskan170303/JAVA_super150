package sliding_window;

public class maximum_sum_window_k {

	public static void main(String[] args) {
		int []arr= {1,4,5,6,7,8,2,3,9,1,};
		int k=5;
		System.out.println(maximum_sum(arr,k));
	}
	public static int maximum_sum(int arr[], int k) {
		int max=0;
		int sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		max=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i];		// growing
			sum=sum-arr[i-k];	// shrinking
			max=Math.max(max, sum);
		}
		return(max);
	}

}
