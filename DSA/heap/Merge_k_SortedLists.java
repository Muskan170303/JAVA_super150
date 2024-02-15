package DSA.heap;
import java.util.*;

public class Merge_k_SortedLists {

	
//	 Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	
	 class Solution {
		    public ListNode mergeKLists(ListNode[] lists) {
		        PriorityQueue<ListNode> pq=new PriorityQueue<>(new Comparator<ListNode>(){
			        @Override
			        public int compare(ListNode o1, ListNode o2) {
			        	return o1.val-o2.val;
			        }
		        });
		        for(ListNode ll : lists) {
		        	if(ll!=null) {
		        		pq.add(ll);
		        	}
		        }
		        ListNode dummy=new ListNode();
		        ListNode temp=dummy;
		        while(!pq.isEmpty()) {
		        	ListNode rmv=pq.poll();
		        	dummy.next=rmv;
		        	dummy=dummy.next;
		        	if(rmv.next!=null) {
		        		pq.add(rmv.next);
		        	}
		        }
		        return temp.next;
		        
		    }
	}
}
