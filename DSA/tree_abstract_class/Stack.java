package DSA.tree_abstract_class;

public interface Stack extends Dynamic_StackI, Data_Str{// A
	// by default abstract method- abstract keyword not required
	// if public is not added in method, then created method is default type.
	
	public void push(int item);
	
	public int pop();
	
	public int peek();
	
//	cannot keep uninitialized
//	int x=9;
	
	public static final int x=9; 
//	final method cannot be override
//	final class cannot be inherited
//	final variable cannot be changed
	
//	default method can have a body => from java8
//	default can only be accessed in this package
//	default void fun() {
//		
//	}
	
//	public method can also have a body =>
//	public static int fun1() {
//		return 0;
//	}
	
//	private and private static can also have body => java9 
//	private static int fun2() {
//		return 0;
//	}
}
