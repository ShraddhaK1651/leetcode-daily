class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=res(n-1,m-1,text1,text2,dp);
        return ans;
    }
    public int res(int i,int j,String text1,String text2,int[][] dp){
        if(i<0 || j<0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];

        if(text1.charAt(i)==text2.charAt(j)){
            return dp[i][j]= 1 + res(i-1,j-1,text1,text2,dp);
        }else{
            return dp[i][j]=Math.max(res(i-1,j,text1,text2,dp),res(i,j-1,text1,text2,dp));
        }
    }
}