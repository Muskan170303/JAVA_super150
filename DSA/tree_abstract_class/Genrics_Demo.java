package DSA.tree_abstract_class;

public class Genrics_Demo {
//	Generic is defined for non-primitive data types  
	public static void main(String args[]) {
		
		Integer arr[]= {10,203,45,89,18};
		Display(arr);
		String arr1[]= {"Ram","Anku","Ankita","Raj"};
		Display(arr1);
	}
	
	public static <T> void Display(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
