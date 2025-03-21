class Solution {
    public int climbStairs(int n) {
        int[]dp = new int[n+1];
        for(int index =0;index<dp.length;index+=1)
        {
            dp[index]=-1;
        }
        dp[0]=1;
        dp[1]=1;
        for(int index =2;index<dp.length;index+=1)
        {
            dp[index]=dp[index-1]+dp[index-2];
        }
       
        ;
        return dp[n];
    }
}