package sliding_window;
	
	//a={1 2 4 3 2} 			k=10
	// 	si	  ei	sub-array		count
	//  0	  0		1				1       grow
	//	0	  1 	1 2				2							
	//				2
	//	0	  2		1 2 4			3
	//				2 4
	//				4
	//	0	  3		1 2 4 3			0		shrink
	//	1	  3		2 4 3			0
	//	2	  3		4 3				0
	//	3	  3		3				1
	//	3	  4     3 2				1		grow
	//  			2 				1

public class subarray_product_less_than_k {
		
	public static void main(String[] args) {
		int[] arr= {1,2,4,3,2};
		int k=10;
		System.out.println(countSubarray(arr,k));
	}
	public static int countSubarray(int []arr,int k){
		int ans=0;
		int si=0;
		int ei=0;
		int p=1;
		while(ei<arr.length) {
			// grow
			p*=arr[ei];
			// shrink
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			// ans calculate
			ans=ans+(ei-si+1);
			ei++;
		}
		return(ans);
	}

}
