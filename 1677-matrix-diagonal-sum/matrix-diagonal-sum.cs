public class Solution {
    public int DiagonalSum(int[][] mat) {
        int diagonalSum =0;
        for(int ind =0;ind<mat.Length ;ind++){
            if(ind==mat.Length-ind-1){
                diagonalSum+=mat[ind][ind];
                mat[ind][ind]=0;
            }else{
            diagonalSum+=(mat[ind][ind]+mat[ind][mat.Length-ind-1]);}
        }
        return diagonalSum;
        
    }
}