package divide_and_conquer;

public class merge_arrays {
	public static void main(String args[]) {
		int a[]= {2,3,5,7,8,9};	
		int b[]= {1,3,6,7,8,9,11,13};	
		int c[]=mergearray(a,b);
		for(int i=0;i<a.length+b.length;i++) {
			System.out.print(c[i]+" ");
		}
		
	}
	public static int[] mergearray(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		int ans[]=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]){
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else{
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return(ans);
	}
}
