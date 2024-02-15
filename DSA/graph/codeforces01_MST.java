package DSA.graph;

import java.util.*;

public class codeforces01_MST {

	private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
	
	public codeforces01_MST(int v) {
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int a, int b, int cost) {
		map.get(a).put(b, cost);
		map.get(b).put(a, cost);
	}
	class PrimsPair{
		int e1;
		int acqv;
		int cost;
		public PrimsPair(int e1,int e2,int cost) {
			this.e1=e1;
			this.acqv=e2;
			this.cost=cost;
		}
	}
	
	
	public void Prims() {
		PriorityQueue<PrimsPair> pq= new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				return o1.cost-o2.cost;
			}
		});
		pq.add(new PrimsPair(1,1,0));
		HashSet<Integer> visited=new HashSet<>();
		int ans=0;
		while(!pq.isEmpty()) {
			PrimsPair rp=pq.poll();
			if(visited.contains(rp.e1)) {
				continue;
			}
			visited.add(rp.e1);
			ans=ans+rp.cost;
			
			for(int nbrs=1;nbrs<=map.size();nbrs++) {
				if(!visited.contains(nbrs)) {
					int cost=0;
					if(map.get(rp.e1).containsKey(nbrs)) {
						cost=1;
					}
					pq.add(new PrimsPair(nbrs, rp.e1, cost));
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();//vtx
		int m=sc.nextInt();//edge
		codeforces01_MST mst=new codeforces01_MST(n);
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			mst.AddEdge(a, b, 1);
		}
		mst.Prims();
	}
	
}
