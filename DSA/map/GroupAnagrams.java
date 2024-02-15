package DSA.map;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		String arr[]= {"eat", "tea", "tan", "ate","nat","bat"};

	}
	
	public static List<List<String>> Anagrams(String arr[]){ 
		HashMap<String,List<String>> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String key=Key(arr[i]);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}
		List<List<String>> ans=new ArrayList<>();
		for(String key:map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;

	}

	private static String Key(String str) {
		int frq[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			frq[ch-'a']++;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<frq.length;i++) {
			sb.append(frq[i]+" ");
		}
		return sb.toString();
	}
}
