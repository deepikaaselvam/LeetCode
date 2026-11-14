class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase =0, decrease =0, maxLength =1;
        for(int ind =0;ind<nums.length-1;ind++){
            if(nums[ind]<nums[ind+1]) {increase++; decrease =0;}
            else if(nums[ind]> nums[ind+1]){decrease++; increase =0;}
            else{
                increase =0;
                decrease =0;
            }
            maxLength = Math.max(maxLength, Math.max(increase, decrease)+1);
        }
        
       return maxLength;
    }
}