class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNo =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int absNumber = Math.abs(nums[i]);
            if(absNumber<Math.abs(closestNo))
            {
                closestNo=nums[i];
            }
            else if(absNumber==Math.abs(closestNo))
            {
                closestNo=Math.max(closestNo,nums[i]);
            }
        }
        return closestNo;
        
    }
}