class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int jIndex =0;
            for(int i=0;i<matrix.length;i++)
            {
                int eachRowLength =matrix[i].length;
                int start = matrix[i][0];
                int end = matrix[i][eachRowLength-1];
                if(target>=start && target<=end)
                    for(int index2=0;index2<matrix[i].length;index2+=1)
                    {
                        if(matrix[i][jIndex]==target && start<=end)
                        {
                            return true;
                        }
                        else {
                            jIndex+=1;
                        }

                    
                    }
                    }

            return false;
        
    }
}