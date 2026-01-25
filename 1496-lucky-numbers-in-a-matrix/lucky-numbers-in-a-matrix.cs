public class Solution {
    public IList<int> LuckyNumbers(int[][] matrix) {
       List<int>minimumArrayList = new List<int>();
        for(int ind =0;ind<matrix.Length;ind++){
            int minimum =int.MaxValue;
            int columnIndex =-1;
            for(int jind = 0;jind<matrix[ind].Length;jind++){
                if(matrix[ind][jind]<minimum){
                    minimum = matrix[ind][jind];
                    columnIndex =jind;
                }
            }
            bool isLucky =true;
            for(int index =0;index<matrix.Length;index++){
                if(matrix[index][columnIndex]>minimum){
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){
                minimumArrayList.Add(minimum);
            }
            
        }
       
        return minimumArrayList;
    }
}