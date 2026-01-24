public class Solution {
    public int[][] Transpose(int[][] matrix) {
        int rows = matrix.Length;
        int cols = matrix[0].Length;
        int[][] newArray = new int[cols][];
        for(int ind =0;ind<cols;ind++){
            newArray[ind]=new int[rows];
        }
        for(int ind =0;ind<matrix.Length;ind++){
            for(int jind =0;jind<matrix[ind].Length;jind++){
                newArray[jind][ind]=matrix[ind][jind];
            }
        }
        return newArray;
        
    }
}