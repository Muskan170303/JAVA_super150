package DSA.graph;

import java.util.*;

public class Course_Schedule {

	class Solution {
	    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        topological ts=new topological(numCourses);
	        for(int i=0;i<prerequisites.length;i++){
	            ts.addedge(prerequisites[i][1],prerequisites[i][0]);
	        }
	        return ts.Topological();
	    }
	    public class topological{
	        HashMap <Integer, HashMap<Integer,Integer>> map = new HashMap<>(); 
	        public topological(int v) {
	            for(int i=0;i<v;i++) {
	                map.put(i, new HashMap<>());
	            }
	        }
	        public void addedge(int v1, int v2) {
	            map.get(v1).put(v2,0);
	        }
	        public int[] indegree() {
	            int v=map.size();
	            int arr[]=new int[v];
	            for(int key:map.keySet()) {
	                for(int nbrs:map.get(key).keySet()) {
	                    arr[nbrs]++;
	                }
	            }
	            return arr;
	        }
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
	            return c==map.size();
	        }
	    }
	}
}
