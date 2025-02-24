class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         int rows = mat.length;
        int cols = mat[0].length;
        ArrayList<Integer> list = new ArrayList<>();

        // There are (rows + cols - 1) diagonals in the matrix.
        for (int sum = 0; sum < rows + cols - 1; sum++) {
            if (sum % 2 == 0) { // Even diagonal: traverse upward.
                int row = Math.min(sum, rows - 1);
                int col = sum - row;
                while (row >= 0 && col < cols) {
                    list.add(mat[row][col]);
                    row--;
                    col++;
                }
            } else { // Odd diagonal: traverse downward.
                int col = Math.min(sum, cols - 1);
                int row = sum - col;
                while (col >= 0 && row < rows) {
                    list.add(mat[row][col]);
                    row++;
                    col--;
                }
            }
        }

        // Convert the list to a primitive int array.
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    
    }
}
/*
//     int row;int j;
    //     int evenIndex,oddIndex;
    //     ArrayList<Integer>list = new ArrayList<>();
    //     for(row =0;row<mat.length;row++)
    //     {
    //         if(row%2==0)
    //         {
    //             for(evenIndex =row,j=0;evenIndex>=0;evenIndex--,j++)
    //             {
    //                 list.add(mat[evenIndex][j]);
    //             }
    //         }
    //         else
    //         {
    //             for(oddIndex =0,j=row;oddIndex<=row;oddIndex++,j--)
    //             {
    //                 list.add(mat[oddIndex][j]);
    //             }
    //         }
    //     }
    //   if((mat.length-1)%2==0) //5*5
    //   {
    //     for(row=1;row<mat.length;row++)
    //     {
    //         if(row%2!=0)
    //         {
    //             for(oddIndex =row,j=mat.length-1;oddIndex<mat.length;oddIndex++,j--)//j>=1
    //             {
    //                 list.add(mat[oddIndex][j]);
    //             }
    //         }
    //         else
    //         {
    //             for(evenIndex =mat.length-1,j=row;j<mat.length;evenIndex--,j++)
    //             {
    //                 list.add(mat[evenIndex][j]);
    //             }
    //         }
    //     }
    //   }
    //   else //4*4
    //   {
    //     for(row =1;row<mat.length;row++)
    //     {
    //         if(row%2!=0){
    //             for(oddIndex =mat.length-1,j=row;j<mat.length;oddIndex--,j++)
    //             {
    //                 list.add(mat[oddIndex][j]);
    //             }
    //         }
    //         else
    //         {
    //             for(evenIndex =row,j=mat.length-1;evenIndex <mat.length;evenIndex++,j--)
    //             {
    //                 list.add(mat[evenIndex][j]);
    //             }
    //         }
    //     }
    //   }
    //   int[]answer =new int[list.size()];
    //  for(int k=0;k<answer.length;k++)
    //  {
    //     answer[k]=list.get(k);
    //  }
    //  return answer;
        */