package codeforces;

import java.util.*;

public class balancedRound_Round886_div4 {
	
//	5 1
//	1 2 4 5 6
	
// 1 2 
// 4 5 6

	public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- > 0){
	        int n=sc.nextInt();
	        int k=sc.nextInt();
	        int arr[]=new int[n];
	        Arrays.sort(arr);
	        List<List<Integer>> ll=new ArrayList<>();
	        ll.add(new ArrayList<>());
	        ll.get(0).add(sc.nextInt());
	        for(int i=1;i<n;i++){
	            arr[i]=sc.nextInt();
	            int c=0;
	            for(int j=0;j<ll.size();j++) {
	            	if(Math.abs(arr[i]-ll.get(j).get(ll.get(j).size()-1))<=k) {
	            		ll.get(j).add(arr[i]);
	            		c=1;
	            	}
	            }
	            if(c==0) {
	            	ll.add(new ArrayList<>());
	            	ll.get(ll.size()-1).add(arr[i]);
	            }
	        }
	        int max=0;
	        for(int i=0;i<ll.size();i++) {
	        	if(ll.get(i).size()>max) {
	        		max=ll.get(i).size();
	        	}
	        }
	        System.out.println(arr.length-max);
	        
	    }
	}
}
