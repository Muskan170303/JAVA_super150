package backtracking;

public class Queen_permutations {

	public static void main(String[] args) {
		int n=4;
		int tq=2;// total queen
		String ans="";
		boolean []board=new boolean[4];
		permutation(board,tq,0,ans);
		
	}// qpsf = queen placed so far
	public static void permutation(boolean[] board,int tq,int qpsf,String ans) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
				board[i]=false; // backtracking
			}
		}
	}

}
