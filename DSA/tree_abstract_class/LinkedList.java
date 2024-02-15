package DSA.tree_abstract_class;

public class LinkedList<T> {

	public class Node{
		T val;
		Node next;
	}
	private Node head;
	private int size;
	private Node tail;
	
	public void Addfirst(T item) {
		Node nn=new Node();
		nn.val=item;
		if(size == 0) {
			this.head = nn;
			this.tail =nn;
			this.size++;
		}
		else {
			nn.next=head;
			head =nn;
			this.size++;
		}
	}
	public void AddLast(T item) {
		if(size==0) {
			Addfirst(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public void Display() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.val +"->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
	public Node GetNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("k is not in range");
		}
		Node temp=head;
		for(int i=1;i<=k;i++) {
			temp=temp.next;
		}
		return temp;
	}
	public void AddatIndex(T item,int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("K is not in range");
		}
		if(k==0) {
			Addfirst(item);
		}
		else if(k==size) {
			AddLast(item);
		}
		else {
			Node nn=new Node();
			nn.val=item;
			Node k_1th=GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=nn;
			nn.next=kth;
			size++;
		}
	}
	public T GetFirst() {
		return head.val;
	}
	public T GetLast() {
		return tail.val;
	}
	public T getatIndex(int k) throws Exception {
		return GetNode(k).val;
	}
	
	public T removeFirst() throws Exception {
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		}
		T ans=head.val;
		if(size==1) {
			head =null;
			tail=null;
			size--;
		}
		else {
			Node temp=head;
			head=head.next;
			temp.next=null;
			size--;
		}
		return ans;
	}
	
	public T removeLast() throws Exception {
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		}
		if(size==1) {
			return removeFirst();
		}
		else {
			T ans=tail.val;
			Node n=GetNode(size-2);
			tail=n;
			tail.next=null;
			size--;
			return ans;
		}
	}
	public T removeatIndex(int k) throws Exception { //k is the index
		if(size==0) {
			throw new Exception("Linkedlist is empty");
		}
		if(k==0) {
			return removeFirst();
		}
		else if(k==size) {
			return removeLast();
		}
		else {
			Node k_1th=GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.val;
		}
	}
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.AddLast("Raj");
		ll.AddLast("Ankit");
		ll.AddLast("Kunal");
		ll.AddLast("Amisha");
		ll.AddLast("Puneet");
		ll.AddLast("Pooja");
		ll.Display();
	}

}
