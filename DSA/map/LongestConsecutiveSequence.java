package DSA.map;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int arr[]= {0, 2, 3, 4, 6, 0, 1, 7, 8,};
		System.out.println(Consecutive_sequence(arr));
	}
	
	public static int Consecutive_sequence(int[] arr) {
        HashMap<Integer, Boolean> map= new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	if(map.containsKey(arr[i]-1)) {
        		map.put(arr[i],	true);
        	}else {
        		map.put(arr[i]+1, false);
        	}
        }
        int ans=0;
        for(int key: map.keySet()) {
        	if(map.get(key)) {
        		int count=0;
        		while (map.containsKey(key)) {
        			count++;
        			key++;
        		}
        		ans=Math.max(ans, count);
        	}
        }
        return ans;
    }

}
