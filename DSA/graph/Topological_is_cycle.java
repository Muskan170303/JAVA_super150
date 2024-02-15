package DSA.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_is_cycle {

	HashMap <Integer, HashMap<Integer,Integer>> map = new HashMap<>(); 
	
	public Topological_is_cycle(int v) {
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addedge(int v1, int v2) {
		map.get(v1).put(v2,0);
	}
	
	public int[] indegree() {
		int v=map.size();
		int arr[]=new int[v+1];
		for(int key:map.keySet()) {
			for(int nbrs:map.get(key).keySet()) {
				arr[nbrs]++;
			}
		}
		return arr;
	}
	
	//cycle
	public boolean Topological() {
		int in[]=indegree();
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<in.length;i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		int c=0;
		while(!q.isEmpty()) {
			int v=q.poll();
			c++;
			for(int nbrs:map.get(v).keySet()) {
				in[nbrs]--;
				if(in[nbrs]==0) {
					q.add(nbrs);
				}
			}
		}
		return c<map.size();
	}
	
	public static void main(String[] args) {
		Topological_is_cycle ts=new Topological_is_cycle(7);
		ts.addedge(1, 2);
		ts.addedge(1, 4);
		ts.addedge(4, 3);
		ts.addedge(3, 2);
		ts.addedge(4, 5);
		ts.addedge(5, 7);
		ts.addedge(6, 3);
		ts.addedge(6, 7);
		System.out.println(ts.Topological());
		
	}
}
