class Solution {
    public long maxMatrixSum(int[][] matrix) {
       int m=matrix[0].length;
       int n=matrix.length;
       long sum=0;
       long smallest=Integer.MAX_VALUE;
       int cnt=0;

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]<0){
                cnt++;
            }
            long val=Math.abs(matrix[i][j]);
            smallest=Math.min(smallest,val);
            sum+=val;
        }
       }
       if(cnt%2==0)return sum;
        return sum-(2*smallest); 
    }
}
/*Because the smallest value is already added once as +smallest in  the absolute sum, but it must finally appear as −smallest, so its contribution changes by (+smallest) − (−smallest) = 2 × smallest, which is why we subtract 2 × smallest, not just smallest. */