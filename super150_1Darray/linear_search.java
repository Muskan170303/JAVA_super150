package super150_1Darray;

public class linear_search {

	public static void main(String[] args) {
		int []arr= {2,4,-1,7,3,8,9};
		int item=3;
		System.out.println("Item found at index="+ findindex(arr,item) );

	}
	public static int findindex(int []arr, int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}