package DSA.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class PathSumIII {

	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	}

	public class Level_Order {

		public class Node{
			int val;
			Node left;
			Node right;
		}
		private Node root;
		
		Scanner sc=new Scanner(System.in);
		
		public Level_Order() {
			CreateTree();
			
		}
		
		private void CreateTree() {
			int item=sc.nextInt();
			Node nn= new Node();
			nn.val=item;
			root=nn;
			Queue<Node> q=new LinkedList<>();
			q.add(nn);
			while(!q.isEmpty()) {
				Node rv= q.remove();
				int c1= sc.nextInt();
				int c2= sc.nextInt();
				if(c1!=-1) {
					Node ll=new Node();
					ll.val=c1;
					rv.left=ll;
					q.add(ll);
				}
				if(c2!=-1) {
					Node ll=new Node();
					ll.val=c2;
					rv.right=ll;
					q.add(ll);
				}
			}
		}
		public static void main(String args[]) {
			PathSumIII m=new PathSumIII();
			Level_Order lv=m.new Level_Order();
			int targetSum=8;
//			System.out.println(sumnode(lv.root, targetSum, targetSum));
		}
		
		public static int sumnode(Node root2, int targetSum, int sum){
	        if(root2==null){
	            return 0;
	        }
	        if(sum==0){
	            return 1;
	        }
	        int lci=sumnode(root2.left, targetSum, sum-root2.val);
	        int rci=sumnode(root2.right, targetSum, sum-root2.val);
	        int lcx=sumnode(root2.left, targetSum, targetSum);
	        int rcx=sumnode(root2.right,targetSum, targetSum);
	        return lci+lcx+rci+rcx;
	    }
		
	}
//	root = [10 5 -3 3 2 -1 11 3 -2 -1 1], targetSum = 8
	
}
