class Solution {
    private static void finalChange(char[][]board)
    {
        for(int ind =0;ind<board.length;ind+=1)
        {
            for(int jind =0;jind<board[ind].length;jind+=1)
            {
                 if(board[ind][jind]=='O')
                    {
                        board[ind][jind]='X';
                    }
                
                else if(board[ind][jind]=='#')
                {
                    board[ind][jind]='O';
                }
            }
        }
    }
    private static void change(char[][]board,int ind,int jind)
    {
        if(ind<0||jind<0||ind>=board.length||jind>=board[ind].length||board[ind][jind]!='O')
        {
            return;
        }
        board[ind][jind]='#';
        change(board,ind,jind-1);
        change(board,ind,jind+1);
        change(board,ind-1,jind);
        change(board,ind+1,jind);
        // if(l==0&& r==0&& t==0 && b==0)
        // {
        //     board[ind][jind]='O';
        // }
        

    }
    public void solve(char[][] board) {
        for(int ind =0;ind<board.length;ind+=1)
        {
            for(int jind =0;jind<board[ind].length;jind+=1)
            {
                if(board[ind][jind]=='O'&&(ind==0 ||jind==0||ind==board.length-1||jind==board[ind].length-1))
                {
                    change(board,ind,jind);
                }
            }
        }
        finalChange(board);
        
    }
}