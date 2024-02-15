package DSA.graph;

import java.util.*;

//		https://leetcode.ca/all/261.html

public class Graph_valid_tree {

	class solution{
		public boolean validTree(int n, int edges[][]) {

			HashMap<Integer, List<Integer>> map=new HashMap<>();
			for(int i=0;i<n;i++) {
				map.put(i, new ArrayList<>());
			}
			for(int i=0;i<edges.length;i++) {
				int a=edges[i][0];
				int b=edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			Queue<Integer> q= new LinkedList<>();
			HashSet<Integer> visited=new HashSet<>();
			int c=0;
			for(int src: map.keySet()) {
				if(visited.contains(src)) {
					continue;
				}
				c++;
				q.add(src);
				while(!q.isEmpty()) {
					// 1. remove
					int rmv=q.poll();
					// 2. if already visited, then ignore
					if(visited.contains(rmv)) {
						return false;
					}
					// 3. mark visited
					visited.add(rmv);
					// 4. self work
					System.out.println(rmv+" ");
					//5. add nbrs
					for( int nbrs : map.get(rmv)) {
						if(!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return c==1;
			
		}
	}
	

}
