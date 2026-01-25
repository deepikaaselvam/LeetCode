public class Solution {
    public int[][] ModifiedMatrix(int[][] matrix) {
        int[][]answer = new int[matrix.Length][];
        
        for(int ind =0;ind<matrix.Length;ind++){
            answer[ind]= new int[matrix[ind].Length];
            int rowIndex =-1;
            for(int jind =0;jind<matrix[ind].Length;jind++){
                if(matrix[ind][jind]!=-1){
                    answer[ind][jind]=matrix[ind][jind];
                }
                else
                {
                     int maximum = int.MinValue;
                    for(int replace=0;replace<matrix.Length;replace++){
                        if(matrix[replace][jind]>maximum){
                            maximum = matrix[replace][jind];
                        }
                    }
                  answer[ind][jind]=maximum;
                }
            }
        }
        return answer;
        
    }
}