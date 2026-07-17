class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(searchWord(i,j,board,word,0)){
                return true;
            }
        }
       }
       return false;
    }
   private boolean searchWord(int i,int j,char[][] board,String word,int idx){
       if(idx==word.length())return true;
       if(i<0 || i>=board.length || j<0 || j>=board[0].length)return false;
       if(board[i][j]!=word.charAt(idx))return false;
       char temp=board[i][j];
       board[i][j]='#';
       boolean found=searchWord(i+1,j,board,word,idx+1)||
                     searchWord(i,j+1,board,word,idx+1)||
                     searchWord(i-1,j,board,word,idx+1)||
                     searchWord(i,j-1,board,word,idx+1);

       board[i][j]=temp;   //backtrack;
       return found;

    }
}