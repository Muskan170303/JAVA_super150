package BitMasking;

public class MaximumXORofTwoNumbers {

	public static class Node{
		Node zero;
		Node one;
	}
	public static void Insert(Node root, int val) {
		Node curr=root;
		for(int i=31;i>=0;i--) {
			int bit=(val & (1<<i));
			if(bit==0) {
				if(curr.zero!=null) {
					curr=curr.zero;
				}else {
					Node nn=new Node();
					curr.zero=nn;
					curr=nn;
				}
			}else {
				if(curr.one!=null) {
					curr=curr.one;
				}else {
					Node nn=new Node();
					curr.one=nn;
					curr=nn;
				}
			}
		}
	}
	public static int xor(Node root,int val) {
		Node curr=root;
		int x=0;
		for(int i=31;i>=0;i--) {
			if((val&(1<<i))==0) {
				if(curr.one!=null) {
					x+=(1<<i);
					curr=curr.one;
				}else {
					curr=curr.zero;
				}
			}else {
				if(curr.zero!=null) {
					x+=(1<<i);
					curr=curr.zero;
				}else {
					curr=curr.one;
				}
			}
		}
		return x;
	}
	public static void main(String[] args) {
		int nums[]= {3,10,5,25,2,8};
		Node nn=new Node();
		for(int i=0;i<nums.length;i++) {
			Insert(nn,nums[i]);
		}
		int mxor=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			int a=nums[i];
			mxor=Math.max(mxor, xor(nn,a));
		}
		System.out.println(mxor);

	}

}
