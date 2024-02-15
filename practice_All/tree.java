package practice_All;

import java.util.LinkedList;
import java.util.Scanner;


// createtree(), display(), max(), find(), ht(), preorder(), postorder(), inorder(), levelorder()
public class tree {
	
	public class Node{ 
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public tree() {
		Node root=createtree();
	}
	
	Scanner sc= new Scanner(System.in);
	
	private Node createtree() {
		int val=sc.nextInt();
		Node nn= new Node();
		nn.data=val;
		Boolean hlc=sc.nextBoolean();
		if(hlc) {
			nn.left=createtree();
		}
		Boolean hrc=sc.nextBoolean();
		if(hlc) {
			nn.right=createtree();
		}
		return nn;
	}
	
	public void display() {
		display(root);
	}
	
	private void display(Node nn) {
		if(nn==null) {
			return;
		}
		String s="<--"+nn.data+"-->";
		if(nn.left!=null) {
			s=nn.left.data+s;
		}
		else {
			s="."+s;
		}
		if(nn.right!=null) {
			s=s+nn.right.data;
		}
		else {
			s=s+".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	}
}
