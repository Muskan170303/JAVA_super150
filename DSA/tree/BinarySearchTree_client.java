package DSA.tree;

public class BinarySearchTree_client {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80}; // ordered array
		BinarySearchTreeImplementation bst = new BinarySearchTreeImplementation(arr);
		bst.PreOrder();
	}

}
