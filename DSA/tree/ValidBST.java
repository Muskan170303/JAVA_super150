package DSA.tree;

public class ValidBST {

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
		 
	class Solution {
	    public boolean isValidBST(TreeNode root) {
		        return ValidBST(root).isbst;
	    }
	    public BSTpair ValidBST(TreeNode root) {
	    	if(root==null){
				return new BSTpair();
			}
	        BSTpair lbp=ValidBST(root.left);
	        BSTpair rbp=ValidBST(root.right);
	        BSTpair sbp= new BSTpair();
	        sbp.max=Math.max(root.val, Math.max(rbp.max,lbp.max));
	        sbp.min=Math.min(root.val, Math.min(lbp.min,rbp.min));
	        if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val) {
	        	sbp.isbst=true;
	        }
	        else {
	        	sbp.isbst=false;
	        }
	        return sbp;
	    }
	    
	}
	
	class BSTpair{
		boolean isbst=true;
		long min=Long.MAX_VALUE;
		long max=Long.MIN_VALUE;
	}
}
