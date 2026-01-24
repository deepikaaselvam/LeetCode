public class Solution {
    public int CountNegatives(int[][] grid) {
        int cnt =0;
        for(int ind =0;ind<grid.Length;ind++){
            for(int jind =grid[ind].Length-1;jind>=0;jind--){
                if(grid[ind][jind]>=0)break;
                cnt++;
            }
        }
        return cnt;
        
    }
}