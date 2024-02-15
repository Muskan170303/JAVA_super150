package wrapper_class;

import java.util.ArrayList;

public class array_list_internal_functioning {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();//default capacity=10
		// capacity and size difference
		// if size exceeds capacity=> new arrayList is formed => new arrayList has the capacity of (old + old/2 +1)
		// hence in default arrayList increases 1.5 times of original
		ArrayList<Integer> list1=new ArrayList<>(190);
		// capacity of arrayList can be changed by adding argument in constructor
		
		// to add		array					operations
		//  10			10							1
		//  20			10 20						1+1
		//  30			10 20 30					2+1
		//  40			10 20 30 40					1
		//  50			10 20 30 40 50 				4+1
		//  60			10 20 30 40 50 60 			1
		//  70			10 20 30 40 50 60 70		1
		//  80			10 20 30 40 50 60 70 80		1
		//  90			10 20 30 40 50 60 70 80	90	1

	}

}
