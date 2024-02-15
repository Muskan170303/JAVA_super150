package backtracking;

public class sudoku_solver {

	public static void main(String[] args) {
		int [][] board= {{5,3,0,0,7,0,0,0,0},
						{6,0,0,1,9,5,0,0,0},
						{0,9,8,0,0,0,0,6,0},
						{8,0,0,0,6,0,0,0,3},
						{4,0,0,8,0,3,0,0,1},
						{7,0,0,0,2,0,0,0,6},
						{0,6,0,0,0,0,2,8,0},
						{0,0,0,4,1,9,0,0,5},
						{0,0,0,0,8,0,0,7,9}};
		sudoku(board,0,0);

	}
	public static void sudoku(int board[][],int row,int col) {
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			display(board);
			return;
		}
		if(board[row][col]!=0) {
			sudoku(board,row,col+1);
		}
		else {
			for(int val=1;val<=9;val++) {
				if(is_safe(board,row,col,val)) {
					board[row][col]=val;
					sudoku(board,row,col+1);
					board[row][col]=0;
				}
			}
		}
	}
	public static boolean is_safe(int board[][],int row,int col,int val) {
		for(int c=0;c<board.length;c++) {
			if(board[row][c]==val) {
				return false;
			}
		}
		for(int r=0;r<board.length;r++) {
			if(board[r][col]==val) {
				return false;
			}
		}
		int r=row-row%3;
		int c=col-col%3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(board[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
	public static void display(int board[][]) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
