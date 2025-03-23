class Solution {
    public double average(int[] salary) {
        double answer =0;
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int index =0;index<salary.length;index+=1)
        {
            if(salary[index]>max)
            {
                max=salary[index];
            }
            if(salary[index]<min)
            {
                min= salary[index];
            }
            answer+=salary[index];
        }
        answer = answer-(min+max);
        int avgCnt =salary.length-2;
        return  (answer/avgCnt);
        
    }
}