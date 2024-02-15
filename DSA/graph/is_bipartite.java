package DSA.graph;

import java.util.*;

public class is_bipartite {

	class solution{
		public boolean isBipartite(int graph[][]) {
			HashMap<Integer,Integer> visited=new HashMap<>();
			Queue<BipartitePair> q=new LinkedList<>();
			for(int i=0;i<graph.length;i++) {
				if(visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i,0));
				while(!q.isEmpty()) {
					BipartitePair rp=q.poll();
					if(visited.containsKey(rp.vtx)) {
						if(visited.get(rp.vtx)!=rp.dis) {
							return false;
						}
						continue;
					}
					visited.put(rp.vtx, rp.dis);
					for(int nbrs : graph[rp.vtx]) {
						if(!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs,rp.dis+1));
						}
					}
				}
			}
			return true;
		}
	}
	class BipartitePair{
		int vtx;
		int dis;
		BipartitePair(int ver, int dis){
			this.vtx=ver;
			this.dis=dis;
		}
	}

}
