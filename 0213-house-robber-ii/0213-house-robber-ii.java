class Solution {
   public int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int first=res(nums,0, n-2, dp1);
        int last=res(nums, 1, n-1, dp2);
        return Math.max(first,last);
        
    }

    public int res(int[] nums, int str,int end, int[] dp){
        if(end < str) return 0;
        if(end==0) return nums[str];

        if(dp[end]!=-1){
            return dp[end];
        }
        int pick=nums[end]+res(nums,str, end-2, dp);
        int notpick=0+res(nums,str,end-1, dp);
        return dp[end]=Math.max(pick,notpick);
    }

}