package DSA.generic_hashmap;

import java.util.*;

// constant complexity

public class generic_HM_implementation<K,V> {

	class Node{
		K key;
		V value;
		Node next;
	}
	
	private ArrayList<Node> ll;
	private int size=0;
	
	public generic_HM_implementation(int n) {
		ll=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ll.add(null);
		}
	}
	
	public generic_HM_implementation() {
		this(4);
	}
	
	// hash function => Bucket define
	public int hashfun(K key) {
		int bn=key.hashCode()%ll.size();
		if(bn<0) {
			bn+=ll.size();
		}
		return bn;
	}
	
	public void put(K key, V value) {
		int ind= hashfun(key);
		Node temp=ll.get(ind);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node();
		nn.key=key;
		nn.value=value;
		temp=ll.get(ind);
		nn.next=temp;
		ll.set(ind, nn);
		size++;
		
		// rehashing implemented
		double thf=2.0;
		double lf=(1.0*size)/ll.size();
		if(lf>thf) {
			rehashing();
		}
	}
	
	private void rehashing() {
		ArrayList<Node> new_list=new ArrayList<>();
		for(int i=0;i<2*ll.size();i++) {
			new_list.add(null);
		}
		ArrayList<Node> oba=ll;
		ll=new_list;
		for(Node temp:oba) {
			while(temp!=null) {
				put(temp.key, temp.value);
				temp=temp.next;
			}
		}
	}

	public V get(K key) {
		int ind= hashfun(key);
		Node temp=ll.get(ind);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	
	public boolean containsKey(K key) {
		int ind= hashfun(key);
		Node temp=ll.get(ind);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public V remove(K key) {
		int ind=hashfun(key);
		Node curr=ll.get(ind);
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			return null;
		}
		else if(prev==null) {
			ll.set(ind, curr.next);
			curr.next=null;
			size--;
			return curr.value;
		}
		else {
			prev.next=curr.next;
			curr.next=null;
			size--;
			return curr.value;
		}
	}
	@Override
	public String toString() {
		String s="{";
		for(Node temp:ll) {
			while(temp!=null) {
				s+=temp.key+"="+temp.value+",";
				temp=temp.next;
			}
		}
		return s+"}";
		
	}
	
}
