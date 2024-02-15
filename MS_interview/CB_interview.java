package MS_interview;

public class CB_interview {

	public static void main(String[] args) {
		int arr[]= {1 ,2 ,2 ,3, 3 ,3 ,4 ,4, 5, 9};
		int item=4;
		int si=0;
		int ei=arr.length;
		
		while(si<ei) {
			int mid=(si+ei)/2;
			if(arr[mid]<item) {
				si=mid+1;
			}
			else if(arr[mid]>=item) {
				ei=mid;
			}
		}
		System.out.println(si);
		
//		int arr[][]= {{2 ,3 ,7 ,8},
//					 {12 ,15 ,17 ,19},	
//					 {67 ,78 ,89 ,90}};
//		int item=15;
//		int row=0;
//		while(row<arr.length){
//			if(arr[row][arr[0].length]<item) {
//				row++;
//			}else {
//				for(int j=arr[0].length-1;j>=0;j++) {
//					if(arr[row][j]==item) {
//						System.out.println(true);
//					}
//				}
//				System.out.println(false);
//			}
//		}
	}
		
		
//	public static boolean func(int arr[][]) {
//		
//	}
}
