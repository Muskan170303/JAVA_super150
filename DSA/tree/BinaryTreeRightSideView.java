package DSA.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {

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
		int maxdepth=0;
	    public List<Integer> rightSideView(TreeNode root) {
	    	List<Integer> ll=new ArrayList<>();
	    	rightview(root,1,ll);
	    	return ll;
	    }
	    public void rightview(TreeNode root, int currlevel, List<Integer> ll) {
	    	if(root==null) {
	    		return;
	    	}
	    	if(maxdepth<currlevel) {
	    		ll.add(root.val);
	    		maxdepth=currlevel;
	    	}
	    	rightview(root.right,currlevel+1,ll);
	    	rightview(root.left,currlevel+1,ll);
	    }
	}
}
