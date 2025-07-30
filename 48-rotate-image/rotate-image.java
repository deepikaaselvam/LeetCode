class Solution {
    // private static void reverse(int start,int end ,int[][]matrix,int[][]ans)
    // {
    //      int row = start;
    //     while(start<=end)
    //     {
           
    //         int temp = ans[row][start];
    //         ans[row][start]=ans[row][end];
    //         ans[row][end]=temp;
    //         start++;
    //         end --;

    //     }
    //     // return ans;
    // }
    private static void swap(int[][]matrix,int start,int end)
    {
        int temp = matrix[start][end];
        matrix[start][end]=matrix[end][start];
        matrix[end][start]=temp;

    }
    private static void reverse(int[][]matrix)
    {
        for(int row=0;row<matrix.length;row+=1)
        {
            int start =0;
            int end = matrix[row].length-1;
            while(start<=end)
            {
                int temp = matrix[row][start];
                matrix[row][start]=matrix[row][end];
                matrix[row][end]=temp;
                start++;
                end--;
            }
        }
        
    }
    public void rotate(int[][] matrix) {
        for(int ind=0;ind<matrix.length;ind+=1)
        {
            for(int jind =ind;jind<matrix[ind].length;jind+=1)
            {
                if(ind!=jind)
                {
                    swap(matrix,ind,jind);
                }
            }
        }
        reverse(matrix);
       
    }
}

//  int[][]answer = new int[matrix.length][matrix.length];
//         //transpose the matrix
//         for(int ind =0;ind<matrix.length;ind+=1)
//         {
//             for(int jind =0;jind<matrix[ind].length;jind+=1)
//             {
//                 answer[ind][jind]=matrix[jind][ind];
//             }
//         }
//         //Reverse the Array 
//         for(int ind =0;ind<matrix.length;ind++)
//         {
//             // int start = matrix[ind][0];
//             // int end = matrox
//           reverse(0,matrix.length-1,matrix,answer);
//         }
//         // return answer;
       