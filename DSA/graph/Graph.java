package DSA.graph;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	
	HashMap<Integer, HashMap<Integer,Integer>> map;
	public Graph(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
	
	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}
	
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}
	
	public int noofedges() {
		int ans=0;
		for(int nbrs : map.keySet()) {
			ans+=map.get(nbrs).size();
		}
		return ans/2;
	}
	
	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	public void removeVertex(int v1) {
		for( int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	
	public void Display() {
		for(int key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}
	
	public boolean haspath(int src, int dest,HashSet<Integer> visited) {
		if(src==dest) {
			return true;
		}
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans=haspath(nbrs,dest, visited);
				if(ans) {
					return ans;
				}
			}
		}
		return false;	
	}
	
	public void printallpath(int src, int dest, HashSet<Integer> visited, String ans) {
		if(src==dest) {
			System.out.println(ans+dest);
			return;
		}
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printallpath(nbrs, dest, visited, ans+src);
			}
		}
		visited.remove(src);
	}

}
