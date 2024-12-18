class Solution {
    public int[] finalPrices(int[] price) {
         int[]answerArray = new int[price.length];
        
        for(int i=0;i<price.length-1;i++)
        {
            boolean checkCondition=false;
            int minimum=price[i];
            for(int j=i+1;j<price.length;j++)
            {
                if(price[j]<=minimum)
                {
                    answerArray[i]=minimum-price[j];
                    checkCondition=true;
                    break;
                }

            }
            if(!checkCondition)
            {
                answerArray[i]=price[i];
            }
        }
        answerArray[price.length-1]=price[price.length-1];
        return answerArray;
        
    }
}