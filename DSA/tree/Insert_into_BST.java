package DSA.tree;

public class Insert_into_BST {
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
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root==null){
	            return new TreeNode(val);
	        }
	        insert(root,val);
	        return root;
	    }
	    public TreeNode insert(TreeNode root, int val){
	        if(root==null){
	            TreeNode nn= new TreeNode();
	            nn.val=val;
	            return nn;
	        }
	        if(root.val>val){
	            TreeNode left=insert(root.left,val);
	            root.left=left;
	        }
	        else{
	            TreeNode right=insert(root.right, val);
	            root.right=right;
	        }
	        return root;
	    }
	}
}
