class Solution {
    public int[] twoSum(int[] nums, int target) {
       int first =0;
        int last =nums.length-1;
        for(int index =1;index<=nums.length;index+=1)
        {
            if(nums[first]+nums[last]==target)
            {
                return new int[]{first+1,last+1};
            }
            else if(nums[first]+nums[last]<target)
            {
                first+=1;
            }
            else if(nums[first]+nums[last]>target)
            {
                last-=1;
            }
        }
        return new int[]{first+1,last+1};
    }
}