class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int cnt=0;
        for(int index=0;index<dominoes.length-1;index+=1)
        {
            int val1= dominoes[index][0];
            int val2= dominoes[index][1];
            for(int jIndex=index+1;jIndex<dominoes.length;jIndex+=1)
            {
                int secondVal1 = dominoes[jIndex][0];
                int secondVal2= dominoes[jIndex][1];
                if(((val1==secondVal1)&&(val2==secondVal2))||(val1==secondVal2)&&(val2==secondVal1)) 
                {cnt++;}
            }
        }
        return cnt;
        
    }
}