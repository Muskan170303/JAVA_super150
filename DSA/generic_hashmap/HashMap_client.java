package DSA.generic_hashmap;

public class HashMap_client {

	public static void main(String[] args) {
		generic_HM_implementation<String, Integer> map=new generic_HM_implementation<>();
		map.put("Raj", 78);
		map.put("Kunal", 88);
		map.put("Ankit", 98);
		map.put("Ankita", 76);
		map.put("Amisha", 78);
		map.put("Anku", 74);
		map.put("Pooja", 38);
		map.put("Shiva", 18);
		System.out.println(map.containsKey("Pooja"));
		System.out.println(map.get("Anku"));
		System.out.println(map.get("Amisha"));
		System.out.println(map);
		}

}
