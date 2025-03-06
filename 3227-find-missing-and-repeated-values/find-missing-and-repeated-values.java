class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[]answer = new int[2];
        int[]CheckArray = new int[10000];
        
        for(int ind1 =0;ind1<grid.length;ind1+=1)
        {
            for(int ind2 =0;ind2<grid[ind1].length;ind2+=1)
            {
                if(CheckArray[grid[ind1][ind2]] ==1)
                    {
                        CheckArray[grid[ind1][ind2]]++;
                    }
                else
                     CheckArray[grid[ind1][ind2]] =1;

            }
        }
        boolean flag1 =false;
        boolean flag2 =false;

        for(int answerCheck =1;answerCheck<CheckArray.length;answerCheck+=1)
        {
            if(CheckArray[answerCheck]==2 && flag2==false)
            {
                flag2=true;
                answer[0]=answerCheck;
            }

            else if(CheckArray[answerCheck]==0 && flag1 ==false)
            {
                flag1 =true;
                answer[1]=answerCheck;
            }
           
            else if(flag1==true && flag2==true)
            {
                break;
            }
        

        }
        return answer;

        
    }
}