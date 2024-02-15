package DSA.STACK;

import java.util.Stack;

public class reverse_stack {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(11);
		st.push(18);
		reverse(st);
		System.out.println(st);

	}
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		insert(st,item);
	
	}
	public static void insert(Stack<Integer> st,int ele) {
		if(st.isEmpty()) {
			st.push(ele);
			return;
		}
		int item=st.pop();
		insert(st,ele);
		st.push(item);
	}
	

}
