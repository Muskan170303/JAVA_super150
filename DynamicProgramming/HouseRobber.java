package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		int nums[]= {2,7,9,3,1};
		System.out.println(moneysum(nums,0));
		
		int arr[]=new int[nums.length];
		Arrays.fill(arr,-1);
		System.out.println(moneysumTD(nums,0,arr));
		
		arr=new int[nums.length];
		Arrays.fill(arr, -1);
		System.out.println(moneysumTDrev(nums,nums.length-1,arr));
		
		System.out.println(moneysumBU(nums));
	}
	
	public static int moneysum(int nums[],int ind) {
		if(ind>=nums.length) {
			return 0;
		}
		int inc=nums[ind]+moneysum(nums,ind+2);
		int dinc=moneysum(nums,ind+1);
		return Math.max(inc, dinc);
	}
	
	public static int moneysumTD(int nums[],int ind,int arr[]) {
		if(ind>=nums.length) {
			return 0;
		}
		if(arr[ind]!=-1) {
			return arr[ind];
		}
		int inc=nums[ind]+moneysumTD(nums,ind+2,arr);
		int dinc=moneysumTD(nums,ind+1,arr);
		return arr[ind]=Math.max(inc, dinc);
	}
	
	public static int moneysumTDrev(int nums[],int ind,int arr[]) {
		if(ind<0) {
			return 0;
		}
		if(arr[ind]!=-1) {
			return arr[ind];
		}
		int inc=nums[ind]+moneysumTDrev(nums,ind-2,arr);
		int dinc=moneysumTDrev(nums,ind-1,arr);
		return arr[ind]=Math.max(inc, dinc);
	}
	
	public static int moneysumBU(int nums[]) {
		if(nums.length==1) {
			return nums[0];
		}
		int dp[]=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[1],nums[0]);
		for(int i=2;i<dp.length;i++) {
			int inc=nums[i]+dp[i-2];
			int dinc=dp[i-1];
			dp[i]=Math.max(inc, dinc);
		}
		return dp[dp.length-1];
		
	}

}
