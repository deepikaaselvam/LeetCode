class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int ind =0;ind<nums.length;ind++)
        {
            sum+=nums[ind];
        }
        int value =sum%k;
      
        return value;
        
    }
}