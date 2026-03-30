class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=res(grid,dp,m-1,n-1);
        return ans;
    }
    public int res(int[][] grid,int[][] dp,int i,int j){
        if(i==0 && j==0)return grid[0][0];
        if(i<0 || j<0)return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)return dp[i][j];
        int left=res(grid,dp,i,j-1);
        int up=res(grid,dp,i-1,j);
        return dp[i][j]=grid[i][j]+Math.min(left,up);
    
    }
}