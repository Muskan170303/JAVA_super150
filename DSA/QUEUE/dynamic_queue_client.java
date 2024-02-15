package DSA.QUEUE;

public class dynamic_queue_client extends dynamic_queue{

	public static void main(String[] args) throws Exception{
		
		dynamic_queue dq = new dynamic_queue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);
		dq.display();

	}

}
