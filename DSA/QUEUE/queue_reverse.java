package DSA.QUEUE;

public class queue_reverse {

	public static void main(String[] args)throws Exception {
		dynamic_queue dq=new dynamic_queue();
		dq.enqueue(1);
		dq.enqueue(12);
		dq.enqueue(14);
		dq.enqueue(16);
		dq.enqueue(21);
		dq.display();
		reverse(dq);
		dq.display();
	}
	public static void reverse(dynamic_queue dq) throws Exception{
		if(dq.isempty()) {
			return;
		}
		int x=dq.dequeue();
		reverse(dq);
		dq.enqueue(x);
	}

}
