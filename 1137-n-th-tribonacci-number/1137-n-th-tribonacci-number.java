class Solution {
    public int tribonacci(int n) {
       int[] dp=new int[n+1];
        int ans=trib(n, dp);
        return ans;
    }

    public int trib(int n, int[] dp) {
        if(n==0)return n;
        if(n==1 ||n==2 )return 1;
        
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= trib(n-1, dp)+trib(n-2, dp)+trib(n-3, dp);
        return dp[n];
    }
}