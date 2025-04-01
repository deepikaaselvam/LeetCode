class Solution {
    public static long  solveQnwithBrainPower(int index,int[][]array ,long[] DPArray ,int length)
    {
        if(index>=length) return 0;
        if(DPArray[index]!=-1) return DPArray[index];
        long points= array[index][0] + solveQnwithBrainPower((index+array[index][1]+1),array,DPArray,length);
        long move = solveQnwithBrainPower(index+1,array,DPArray,length);


        return DPArray[index]=Math.max(points,move);
    }
    public long mostPoints(int[][] questions) {
        if(questions.length==1)
        {
            int answer =questions[0][0];
            return answer;
        }
        int length = questions.length;
        long[]dpArray = new long[length];
        Arrays.fill(dpArray,-1);
        return solveQnwithBrainPower(0,questions,dpArray,length);

    }
}



       /* int maximum = Integer.MIN_VALUE;
        int answer =0;
        int index =0;
        while(index<questions.length)
        {
            int jIndex =index;
            answer =0;
            while(jIndex<questions.length)
            {
                int pts =questions[jIndex][0];
                int skip = questions[jIndex][1];
                answer+=pts;
                jIndex+=(skip+1);
            }
            maximum =Math.max(maximum,answer);
            index+=1;
        }
        return maximum;*/
  