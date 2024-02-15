package DSA.map;

import java.util.LinkedHashMap;

public class linkedHashMap_Demo {

	public static void main(String[] args) {
		LinkedHashMap <String, Integer> map2=new LinkedHashMap<>();
		//put
		map2.put("Raj",68);
		map2.put("Manish",78);
		map2.put("Amisha",67);
		map2.put("Puneet",98);
		map2.put("Atul",68);
		map2.put("Pooja",68);
		map2.put("Ankit",68);
		map2.put("Ankita",78);
		map2.put("Pooja",58);
		map2.put(null, 78);
		System.out.println(map2);
		System.out.println(map2.keySet());
		for(String k : map2.keySet()) {
			System.out.println(k+ " " +map2.get(k));
		}
	}
}
