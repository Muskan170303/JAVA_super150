package DSA.STACK;

import java.util.Stack;

// stock span,sunny building, daily temperature =>same concept
public class sunny_building {

	public static void main(String[] args) {
		int arr[]= {11,2,3,23,13,9,15};
		sb(arr);
	}
	public static void sb(int arr[]) {
		int ans[]=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
