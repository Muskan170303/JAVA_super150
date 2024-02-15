package DSA.STACK;

import java.util.Stack;

public class add_element_to_bottom {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(21);
		st.push(19);
		st.push(11);
		st.push(18);
		int ele=5;
		insert(st,ele);
		System.out.println(st);

	}
	public static void insert(Stack<Integer> st,int ele) {
		if(st.size()==0) {
			st.push(ele);
			return;
		}
		int item=st.pop();
		insert(st,ele);
		st.push(item);
	}

}
