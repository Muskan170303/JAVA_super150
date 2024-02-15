package DSA.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFord_algo {

	 HashMap<Integer, HashMap<Integer,Integer>> map;
	 class BellmanFordPair{
		int e1;
		int e2;
		int cost;
		public BellmanFordPair(int e1,int e2,int cost) {
			this.e1=e1;
			this.e2=e2;
			this.cost=cost;
		}
		@Override
		public String toString() {
			return this.e1+" "+this.e2+" @ "+this.cost;
		}
	}
 
	public BellmanFord_algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
//		map.get(v2).put(v1,cost);
	}
	public List<BellmanFordPair> GetAllEdge(){
		List<BellmanFordPair> ll=new ArrayList<>();
		for(int e1: map.keySet()) {
			for(int e2: map.get(e1).keySet()) {
				int cost=map.get(e1).get(e2);
				ll.add(new BellmanFordPair(e1,e2,cost));
			}
		}	
		return ll;
	}
	public void Bellman() {
		List<BellmanFordPair> ll=GetAllEdge();
		int v=map.size();
		int dis[]=new int[v+1];
		for(int i=2;i<dis.length;i++) {
			dis[i]=9999999;
		}
		for(int i=1;i<=v;i++) {
			for(BellmanFordPair e: ll) {
				if(i==v && dis[e.e2] > dis[e.e1]+ e.cost) {
					System.out.println("-ve weight cycle present in the graph");
					return;
				}
				if(dis[e.e2] > dis[e.e1]+ e.cost) {
					dis[e.e2]=dis[e.e1]+e.cost;
				}
			}
		}
		for(int i=1;i<dis.length;i++) {
			System.out.println(dis[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		BellmanFord_algo g=new BellmanFord_algo(5);
		g.AddEdge(1, 2, 8);
		g.AddEdge(2, 5, -2);
//		g.AddEdge(2, 5, 2);
		g.AddEdge(5, 2, 1);
		g.AddEdge(4, 5, 4);
		g.AddEdge(3, 4, -3);
		g.AddEdge(1, 3, 4);
		g.AddEdge(1, 4, 5);
		g.Bellman();
	}

}
