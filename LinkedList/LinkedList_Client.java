package LinkedList;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		
		linkedList_implementation ll = new linkedList_implementation();
		ll.AddFirst(3);
		ll.AddFirst(-3);
		ll.AddFirst(1);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(34);
		ll.Display();
		ll.AddatIndex(-9, 3);
		ll.Display();
		//System.out.println(ll.removeFirst());
		//System.out.println(ll.removeLast());
		System.out.println(ll.removeatIndex(2));
		ll.Display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getatIndex(2));

	}

}
