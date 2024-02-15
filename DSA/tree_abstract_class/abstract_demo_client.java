package DSA.tree_abstract_class;

public class abstract_demo_client {

	public static void main(String args[]) {
		// abstract class ka object nhi banate, but banane ka tareeka h
		
//		abstract_demo ab= new abstract_demo();
		Payment_Demo py = new Payment_Demo();
		
		// anonymous payment method
		abstract_demo ab1= new abstract_demo() {
			@Override
			public void Payment() {
				
			}
		};
	}
}
