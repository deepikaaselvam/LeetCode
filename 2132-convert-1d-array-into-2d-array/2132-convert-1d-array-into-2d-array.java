class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][]TwoDArray = new int[m][n];
        if(original.length !=(m*n))
        {
            return new int[][]{};
        }
        // int OriginalArrayIndex=0;
        int row,col;
        for(row=0;row<m;row+=1)
        {
            for(col=0;col<n;col+=1)
            {
                TwoDArray[row][col]=original[row*n+col];
                // OriginalArrayIndex+=1;
            }
        }
        return TwoDArray;
    }
}