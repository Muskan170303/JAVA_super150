package wrapper_class;

import java.util.ArrayList;

public class array_list_intro {

	public static void main(String[] args) {
		// creating ArrayList -
		// ArrayaList of int => ArrayaList<Integer> 
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println(list.size());
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1,50); // to add at 1th index
						// range of index in add can vary from 0 to size
		System.out.println(list);
		
		System.out.println(list.remove(3)); // returns the removed element
											//range of index in remove can vary from 0 to size-1
		System.out.println(list);
		
		System.out.println(list.get(2)); // returns the element but does not remove it from ArrayList
											//range of index in get can vary from 0 to size-1
		System.out.println(list);
		
		System.out.println(list.set(2,-90)); //range of index in set can vary from 0 to size-1
		System.out.println(list);
	}

}
