class Solution {
    private static boolean  partitionSubsetSum_helper(int index,int[]nums,int value,int half,Boolean [][]dp)
    {
        if(value ==half)
        {
            return true;
        }
        if(index==0)
        {
            return ((value+nums[0])==half);
        }
        if(dp[index][value]!=null){return dp[index][value];}
        boolean Take =false;
        if(nums[index]+value<=half)
        {
            Take = partitionSubsetSum_helper(index-1,nums,value+nums[index],half,dp);
        }
        boolean NotTake =partitionSubsetSum_helper(index-1,nums,value,half,dp);
        return dp[index][value]=Take|| NotTake;

    }
    public static boolean partitionSubsetSum(int[]nums,int totalSum)
    {
         if(totalSum%2!=0)
        {
            return false;
        }
        int half =totalSum/2;
        int value =0;
        Boolean [][]dp = new Boolean[nums.length][half+1];
       return partitionSubsetSum_helper(nums.length-1,nums,value,half,dp);
    }
    public boolean canPartition(int[] nums) {
        int totalSum =0;
        for(int ind =0;ind<nums.length;ind+=1)
        {
            totalSum+=nums[ind];
        }
        int halfSum = totalSum /2;
        return partitionSubsetSum(nums,totalSum);
        
    }
}