package recursion;

public class matrix_reach_HV_only {

	public static void main(String[] args) {
		int x=2;int y=3;
		int xi=1;int yi=1;
		String s="";
		System.out.println(mat_reach(x,y,xi,yi,s));

	}
	public static int mat_reach(int x,int y,int xi,int yi,String s) {
		if(xi==x && yi==y) {
			System.out.println(s);
			return 1;
		}
		int a=0,b=0;
		if(xi!=x) {
			a=mat_reach(x,y,xi+1,yi,s+"V");
		}
		if(yi!=y) {
			b=mat_reach(x,y,xi,yi+1,s+"H");
		}
		return(a+b);
	}

}
