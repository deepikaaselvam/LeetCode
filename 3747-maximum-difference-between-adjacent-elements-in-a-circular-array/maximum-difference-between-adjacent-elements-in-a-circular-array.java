class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maximum =Integer.MIN_VALUE;
        int ans=0;
        for(int ind =0;ind<nums.length;ind+=1)
        {
            if(ind ==nums.length-1)
            {
                ans = Math.abs(nums[ind]-nums[0]);
            }
            else
            {
                ans = Math.abs(nums[ind]-nums[ind+1]);
            }
            maximum =Math.max(maximum,ans);
            
        }
        return maximum;
        
    }
}