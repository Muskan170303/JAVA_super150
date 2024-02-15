package DSA.map;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_ArraysII {

	public static void main(String[] args) {
		int arr1[]= {4,9,5};
		int arr2[]= {9,4,9,8,4};
		int ans[]=intersection(arr1,arr2);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] intersection(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0; i<arr1.length; i++) {
			if(map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i])+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr2.length; i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
		}
		int ans[]=new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i]=list.get(i);
		}
		return ans;
	}

}
