class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1]; //0
        Arrays.fill(dp,-1); //-1
        int ways=countWays(n, dp);
        return ways;
    }

    public int countWays(int n,int[] dp){
        if(n==0 ) return 1;
        if(n==-1) return 0;

        if(dp[n]!=-1){ //already calculated

            return dp[n];
        }

        dp[n]=countWays(n-1, dp)+countWays(n-2, dp);

        return dp[n];
    }
}