package DSA.set;

import java.util.HashSet;

public class hashSet_Demo {

	public static void main(String args[]) {
		
		HashSet<Integer> set= new HashSet<>();
		set.add(4);
		set.add(41);
		set.add(30);
		set.add(2);
		set.add(11);
		set.add(-4);
		System.out.println(set);
		System.out.println(set.contains(4));
		System.out.println(set.remove(11));
		System.out.println(set);
		System.out.println(set.size());
	}
	
}
