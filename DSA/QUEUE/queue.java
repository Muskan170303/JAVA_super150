package DSA.QUEUE;

public class queue {

	protected int []arr;
	protected int front;
	private int size;
	public queue() {
		arr=new int [5];
		front=0;
		size=0;
	}
	public queue(int n) {
		arr=new int [n];
		front=0;
		size=0;
	}
	public boolean isempty() {
		return size==0;
	}
	public boolean isfull() {
		return size==arr.length;
	}
	public int size() {
		return size;
	}
	public void enqueue(int item) throws Exception {
		if(isfull()) {
			throw new Exception("Queue is full");
		}
		int ind=(front + size)%arr.length;
		arr[ind]=item;
		size++;
	}
	public int dequeue() throws Exception {
		if(isempty()) {
			throw new Exception("Queue is empty");
		}
		int rv=arr[front];
		front=(front+1)%arr.length;
		size--;
		return rv;
	}
	public int getfront() {
		int rv=arr[front];
		return rv;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			int ind=(front+i)%arr.length;
			System.out.print(arr[ind]+" ");
		}
		System.out.println();
	}

}
