package DSA.map;

import java.util.HashMap;

public class hashMap_Demo {

	public static void main(String[] args) {
		HashMap <String, Integer> map=new HashMap<>();
		//put
		map.put("Raj",68);
		map.put("Manish",78);
		map.put("Amisha",67);
		map.put("Puneet",98);
		map.put("Atul",68);
		map.put("Pooja",68);
		map.put("Ankit",68);
		map.put("Ankita",78);
		map.put("Pooja",58);
		map.put(null, 78);
		System.out.println(map);
		
		//get
		System.out.println(map.get("Ankit"));
		System.out.println(map.get("Anku"));
		
		//remove
		System.out.println(map.remove("Anku"));
		System.out.println(map.remove("Ankit"));
		System.out.println(map);
		
		//contains
		System.out.println(map.containsKey("kunal"));
		System.out.println(map.containsKey("Raj"));
	}

}
