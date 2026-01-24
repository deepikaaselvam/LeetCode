public class Solution {
    public int[] RowAndMaximumOnes(int[][] mat) {
        int maxOnes =0;
        int rowIndex =0;
        for(int ind =0;ind<mat.Length;ind++){
            int cnt =0;
            for(int jind =0;jind<mat[ind].Length;jind++){
                cnt+=mat[ind][jind];
               
            }
             if(cnt>maxOnes){
                    maxOnes = cnt;
                    rowIndex = ind;
                }
        }
        return new int[]{rowIndex,maxOnes};
    }
}