package MS_interview;

import java.util.*;
//public class olt_2nd_attempt {
//	public static void main(String args[]) {
//        int result=-1;
//        int A[]= {3,1,5,3,3,4,2};
//        result=Math.max(equalresult(A,0,A.length-3,A[A.length-1]+A[A.length-2]),result);
//        result=Math.max(equalresult(A,1,A.length-2,A[A.length-1]+A[0]),result);
//        result=Math.max(equalresult(A,2,A.length-1,A[0]+A[1]),result);
//        System.out.println(result+1);
//    }
//    public static int equalresult(int arr[], int i,int j,int sum){
//        if(j-i<1){
//            return 0;
//        }
//        int ans=-1;
//        if(arr[i]+arr[i+1]==sum){
//            ans=Math.max(equalresult(arr,i+2,j,sum),ans);
//        }
//        if(arr[i]+arr[j]==sum){
//            ans=Math.max(equalresult(arr,i+1,j-1,sum),ans);
//        }
//        if(arr[j-1]+arr[j]==sum){
//            ans=Math.max(equalresult(arr,i,j-2,sum),ans);
//        }
//        return ans+1;
//    }
//
//
//}

class Solution {
    public static int findMax(int e1, int e2) {
        return (e1>e2) ? e1:e2;
    }
    public int solution(int[] A) {
        if(A.length <= 1) return 0;
	    Arrays.sort(A);
	    int dp[][]=new int[A.length][A.length];
	    for (int p=0;p<A.length;p++) {
	        for (int q=0;q<A.length;q++) {
	            dp[p][q]=2;
	        }
	    }
	    int ans=2;
	    for(int q=A.length-2;q>=1;q--) {
	        int p=q-1;
	        int r=q+1;
	        while(p>=0 && r<A.length) {
	            int dis=A[r]+A[p]-2*A[q];
	            if (dis==0) {
	                dp[p][q]=dp[q][r]+1;
	                ans=findMax(ans,dp[p][q]); 
	                r++;
	                p--;
	            }else if(dis>0){
	                p--;
	            }else{
	                r++;
	            }
	        }
	    }
	    return ans;
    }
}

    

