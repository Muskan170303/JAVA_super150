package DSA.STACK;

import DSA.QUEUE.dynamic_queue;

public class stack_using_queue {
	private dynamic_queue dq=new dynamic_queue();
	public boolean isempty() {
		return dq.isempty();
	}
	public int size() {
		return dq.size();
	}
	public void push(int item) throws Exception{
		dq.enqueue(item);
	}
	public int pop() throws Exception{
		dynamic_queue hlp= new dynamic_queue();
		while(dq.size()>1) {
			hlp.enqueue(dq.dequeue());
		}
		int x=dq.dequeue();
		while(hlp.size()>0) {
			dq.enqueue(hlp.dequeue());
		}
		return x;
	}
	public int peek() throws Exception{
		dynamic_queue hlp= new dynamic_queue();
		while(dq.size()>1) {
			hlp.enqueue(dq.dequeue());
		}
		int x=dq.dequeue();
		while(hlp.size()>0) {
			dq.enqueue(hlp.dequeue());
		}
		dq.enqueue(x);
		return x;
	}
	public static void main(String args[]) throws Exception{
		stack_using_queue st=new stack_using_queue();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}
