package DSA.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BinaryTree(){
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
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if(nn==null) {
			return;
		}
		String s="";
		s= "<--" + nn.data + "-->";
		if(nn.left!=null) {
			s = nn.left.data + s;
		}
		else {
			s = "." + s;
		}
		if(nn.right!=null) {
			s = s + nn.right.data;
		}
		else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.data,Math.max(left, right));
	}
	
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(Node nn, int item) {
		if(nn==null) {
			return false;
		}
		if(nn.data==item) {
			return true;
		}
		boolean left = find(nn.left,item);
		boolean right = find(nn.right,item);
		return left || right;
	}
	
	public int ht() {
		return ht(root);
	}
	
	private int ht(Node nn) {
		if(nn==null) {
			return -1; //for single node height=0
			//return 0; for single node height=1
		}
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(lh, rh) + 1;
	}
	
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}
	
	private void PreOrder(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.print(nn.data+" ");
		PreOrder(nn.left);
		PreOrder(nn.right);
	}
	
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}
	
	private void PostOrder(Node nn) {
		if(nn==null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.data+" ");
	}
	
	public void InOrder() {
		InOrder(this.root);
		System.out.println();
	}
	
	private void InOrder(Node nn) {
		if(nn==null) {
			return;
		}
		InOrder(nn.left);
		System.out.print(nn.data+" ");
		InOrder(nn.right);
	}
	
	public void LevelOrder() {
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node rv=q.remove();  // remove first => q.poll()  used in priority queue
			System.out.print(rv.data+" ");
			if(rv.left!=null) {
				q.add(rv.left);
			}
			if(rv.right!=null) {
				q.add(rv.right);
			}
		}
		System.out.println();
	}
	
}
