class Solution {
    public int missingNumber(int[] nums) {
        int totalSum =0;
        int remainingSum =0;
        int n = nums.length;
        for(int ind =0;ind<=n;ind++){
            totalSum += ind;
        }
        for(int ind =0; ind<nums.length;ind++){
            remainingSum += nums[ind];
        }
        return (totalSum - remainingSum);
    }
}