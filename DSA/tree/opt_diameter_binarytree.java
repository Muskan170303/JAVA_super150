package DSA.tree;

public class opt_diameter_binarytree {
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
	class DiaPair{
		int dia=0;
		int ht=-1;
	}
	class Solution{
		public int diameterofbinarytree(TreeNode root) {
			return diameter(root).dia;
		}
		
		public DiaPair diameter(TreeNode root) {
			if (root==null){
				return new DiaPair();
			}
			DiaPair ldp= diameter(root.left);
			DiaPair rdp= diameter(root.right);
			int sd = ldp.ht + rdp.ht +2;
			DiaPair sdp = new DiaPair();
			sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
			sdp.ht=Math.max(ldp.ht, rdp.ht)+1;
			return sdp;
		}
	}
}
