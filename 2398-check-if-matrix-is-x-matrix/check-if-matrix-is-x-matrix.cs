public class Solution {
    public bool CheckXMatrix(int[][] grid) {
        for(int ind =0;ind<grid.Length;ind++){
            for(int jind =0;jind<grid[ind].Length;jind++){
                if(ind==jind ||jind==grid.Length-ind-1){
                    if(grid[ind][jind]==0)
                    return false;
                }else{
                    if(grid[ind][jind]!=0){
                    return false;}
                }
            }
        }
        return true;
        
    }
}