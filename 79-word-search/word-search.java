class Solution {
    private static boolean nextMove(int ind,int jind,
    int m,int n,char[][]board,String word,int k)
    {
        if( k == word.length())return true;
        if(ind<0||ind==m||jind<0 || jind ==n|| board[ind][jind]!=word.charAt(k))
        {
            return false;
        }
        char ch = board[ind][jind];
        board[ind][jind]='%';
       boolean result =  nextMove(ind+1,jind,m,n,board,word,k+1) ||

                        nextMove(ind,jind+1,m,n,board,word,k+1) ||

                        nextMove(ind-1,jind,m,n,board,word,k+1) ||

                        nextMove(ind,jind-1,m,n,board,word,k+1);
        board[ind][jind]=ch;
       return result;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;        
        for(int ind =0;ind<board.length;ind+=1)
        {
            int n= board[ind].length;
            for(int jind =0;jind<board[ind].length;jind+=1)
            {
                if(board[ind][jind]==word.charAt(0))
                {
                     if(nextMove(ind,jind,m,n,board,word,0))
                    {
                        return true;
                    }
                }             
            }
        }
        return false;       
    }
}