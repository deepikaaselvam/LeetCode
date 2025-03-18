class Solution {
    public int longestNiceSubarray(int[] nums) {
        
        if(nums.length==1)
        {
            return nums.length;
        }
        int length = Integer.MIN_VALUE;
        int left =0;
        int right =0 ;
        int usedBits =0;
        while(right<nums.length)
        {
            while((usedBits & nums[right])!=0)
            {
                usedBits = usedBits ^ nums[left];
                left+=1;
            }
            usedBits =usedBits| nums[right];
            length = Math.max(length,right-left+1);
            right+=1;
        }
        return length;
    }
}