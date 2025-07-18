class Solution {
      private static boolean bSearch(int start,int end,int particularRow,int[][]mat,int target)
    {
        while(start<=end)
        {
            int mid = start +((end-start)/2);
            if(mat[particularRow][mid]==target) return true;
            else if(mat[particularRow][mid]<target) start=mid+1;
            else end =mid-1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] mat, int target) {
        int row=0;
       while(row<mat.length)
       {
           if(mat[row][0]<=target&& mat[row][mat[row].length-1]>=target)
               return bSearch(0,mat[row].length-1,row,mat,target);
        
           row++;
           
       }
       return false;
    }
}



//   for(int jind =0;jind<mat[row].length;jind+=1)
            //   {
            //       if(mat[row][jind]==x)
            //       {
            //           return true;
            //       }
            //   }
            // int start = mat[row][0];
            // int end = mat[row][mat[row].length-1];