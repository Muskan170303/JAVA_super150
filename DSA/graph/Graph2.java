package DSA.graph;

import java.util.*;

public class Graph2 {
	
	HashMap<Integer, HashMap<Integer,Integer>> map;
	public Graph2(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
	
	public boolean BFS(int src, int des) {
		
		Queue<Integer> q= new LinkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			// 1. remove
			int rmv=q.poll();
			// 2. if already visited, then ignore
			if(visited.contains(rmv)) {
				continue;
			}
			// 3. mark visited
			visited.add(rmv);
			// 4. self work
			if(rmv==des) {
				return true;
			}
			//5. add nbrs
			for( int nbrs : map.get(rmv).keySet()){
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
	
	public boolean DFS(int src, int des) {
		
		Stack<Integer> st= new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		st.push(src);
		while(!st.isEmpty()) {
			// 1. remove
			int rmv=st.pop();
			// 2. if already visited, then ignore
			if(visited.contains(rmv)) {
				continue;
			}
			// 3. mark visited
			visited.add(rmv);
			// 4. self work
			if(rmv==des) {
				return true;
			}
			//5. add nbrs
			for( int nbrs : map.get(rmv).keySet()) {
				if(!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}
	
	public void BFT() {
		
		Queue<Integer> q= new LinkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		for(int src: map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			q.add(src);
			while(!q.isEmpty()) {
				// 1. remove
				int rmv=q.poll();
				// 2. if already visited, then ignore
				if(visited.contains(rmv)) {
					continue;
				}
				// 3. mark visited
				visited.add(rmv);
				// 4. self work
				System.out.println(rmv+" ");
				//5. add nbrs
				for( int nbrs : map.get(rmv).keySet()) {
					if(!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		
	}
	
	public void DFT() {
		
		Stack<Integer> st= new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		for(int src: map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			st.push(src);
			while(!st.isEmpty()) {
				// 1. remove
				int rmv=st.pop();
				// 2. if already visited, then ignore
				if(visited.contains(rmv)) {
					continue;
				}
				// 3. mark visited
				visited.add(rmv);
				// 4. self work
				System.out.println(rmv+" ");
				//5. add nbrs
				for( int nbrs : map.get(rmv).keySet()) {
					if(!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
		}
		
	}

}
