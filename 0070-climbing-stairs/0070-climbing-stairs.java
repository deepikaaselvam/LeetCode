class Solution {
    public int climbStairs(int n) {
        int prev2=1;
        int prev1=1;
        for(int index =2;index<=n;index+=1){
            int cur_index =prev2+prev1;
            prev2=prev1;
            prev1=cur_index;
        }
        return prev1;
        // int[]dp = new int[n+1];
        // for(int index =0;index<dp.length;index+=1)
        // {
        //     dp[index]=-1;
        // }
        // dp[0]=1;
        // dp[1]=1;
        // for(int index =2;index<dp.length;index+=1)
        // {
        //     dp[index]=dp[index-1]+dp[index-2];
        // }
       
        // ;
        // return dp[n];
    }
}