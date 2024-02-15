package DSA.set;

import java.util.TreeSet;

public class treeSet_Demo {

	public static void main(String[] args) {

		TreeSet<Integer> set= new TreeSet<>();
		set.add(4);
		set.add(41);
		set.add(30);
		set.add(2);
		set.add(11);
		set.add(-4);
		set.add(11);
		System.out.println(set);
		System.out.println(set.contains(4));
		System.out.println(set.remove(11));
		System.out.println(set);
		System.out.println(set.size());
		// for each loop
		for(int val :set) {
			System.out.println(val+" ");
		}
		
	}

}
