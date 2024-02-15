package DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int[] cost= {1,100,1,1,1,100,1,1,100,1};
		int arr[] = new int[cost.length+1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		int first=climbcost(cost,0,arr);
		int second=climbcost(cost,1,arr);
		System.out.println(Math.min(first, second));
		

	}
	public static int climbcost(int cost[],int ind, int arr[]) {
		if(ind>=cost.length) {
			return 0;
		}
		if(arr[ind]!=Integer.MAX_VALUE) {
			return arr[ind];
		}
		int next=climbcost(cost,ind+1,arr);
		int next2next=climbcost(cost,ind+2,arr);
		return arr[ind]=Math.min(next, next2next)+cost[ind];
	}

}
