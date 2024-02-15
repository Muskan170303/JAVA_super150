package DSA.heap;

import java.util.*;

public class Leetcode1337 {

	public static void main(String[] args) {
		int mat[][]={{1,1,0,0,0}, // 2 -->2
				 	{1,1,1,1,0},  // 4
				 	{1,0,0,0,0},  // 1 -->1
				 	{1,1,0,0,0},  // 2 -->3
				 	{1,1,1,1,1}}; // 5
		int k=3;
		PriorityQueue<int[]> pq=new PriorityQueue<>((new Comparator<int[]>() {
			public int compare(int o1[], int o2[]) {
				if(o1[0]==o2[0]) {
					if(o1[1]<o2[1]) {
						return -1;
					}
					else {
						return 1;
					}
				}
				return o1[0]-o2[0];
			}
		}));
		for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    sum++;
                }else{
                    break;
                }
            }
            int n[]={sum,i};
            pq.add(n);
		}
        for(int i=0;i<k;i++){
        	System.out.println(pq.poll()[1]+" ");
        }
	}
}
