class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int maximum =prices[0];
        for(int ind =1;ind<prices.length;ind+=1)
        {
            if(prices[ind]>maximum)
            {
                profit=Math.max(profit,(prices[ind]-maximum));
            }
            else
            {
                maximum =prices[ind];
            }
        }
        return profit;
        
    }
}