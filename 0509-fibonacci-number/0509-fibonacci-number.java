class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        int res=findFib(n,dp);
        return res;
    }
    public int findFib(int n,int[] dp){
        if(n==0 || n==1)return n;
        if(dp[n]!=0){
            return dp[n];
        }
        return findFib(n-1,dp)+findFib(n-2,dp);
    }
}