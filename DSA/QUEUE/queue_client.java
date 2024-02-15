package DSA.QUEUE;

public class queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue dq= new queue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		dq.display();
	}

}
