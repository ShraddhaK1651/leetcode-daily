class Solution {
    public void rotate(int[][] matrix) {
        int[][]nums=new int[matrix.length][matrix[0].length];
        int rows=matrix.length;
        int cols=matrix[0].length;
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            nums[j][i]=matrix[i][j];
        }
       } 
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        matrix[i][cols-j-1]=nums[i][j];
        }
        
       } 
       
    }
}