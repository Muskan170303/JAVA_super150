package DSA.STACK;

import java.util.Stack;
public class last_element {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(11);
		st.push(18);
		System.out.println(LastValue(st));
	}
	public static int LastValue(Stack<Integer> st) {
		if(st.size()==1) {
			return st.peek();
		}
		int item=st.pop();
		int x=LastValue(st);
		st.push(item);
		return x;
	}

}
