class Solution {
    private static int findOutIslands(char[][]grid,int ind,int jind)
    {
        if(ind<0||jind<0||ind==grid.length||jind==grid[0].length||grid[ind][jind]=='0')
        {
            return 0;
        }
        grid[ind][jind]='0';
        int left=findOutIslands(grid,ind,jind-1);
        int right = findOutIslands(grid,ind,jind+1);
        int top = findOutIslands(grid,ind-1,jind);
        int bottom = findOutIslands(grid,ind+1,jind);
        return 1+left+right+top+bottom;
    }
    public int numIslands(char[][] grid) {
        int cnt=0;
        int value=0;
        for(int ind =0;ind<grid.length;ind++)
        {
            for(int jind =0;jind<grid[ind].length;jind+=1)
            {
                if(grid[ind][jind]=='1')
                {
                    cnt++;
                  findOutIslands(grid,ind,jind);
                }
            }
        }
        return cnt;
     
        
    }
}