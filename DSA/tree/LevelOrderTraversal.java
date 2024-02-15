package DSA.tree;

import java.util.*;

//10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

public class LevelOrderTraversal {
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public LevelOrderTraversal(){
		root=createtree();
	}
	
	Scanner sc=new Scanner(System.in);
	
	private Node createtree() {
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=createtree();
		}
		boolean hrc=sc.nextBoolean();
		if(hrc) {
			nn.right=createtree();
		}
		return nn;
	}
	public void LevelOrder() {
		Queue<Node> q= new LinkedList<>();
		Queue<Node> hlp= new LinkedList<>();
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll=new ArrayList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv=q.remove();  // remove first => q.poll()  used in priority queue
			ll.add(rv.data);
			if(rv.left!=null) {
				hlp.add(rv.left);
			}
			if(rv.right!=null) {
				hlp.add(rv.right);
			}
			if(q.isEmpty()) {
				q=hlp;
				hlp=new LinkedList<>();
				ans.add(ll);
				ll=new ArrayList<>();
			}
		}
		System.out.println(ans);
	}
	public static void main(String args[]) {
		LevelOrderTraversal lv=new LevelOrderTraversal();
		lv.LevelOrder();
	}
}
