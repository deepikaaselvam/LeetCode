class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
         int longest=Integer.MIN_VALUE;
        java.util.Arrays.sort(nums);int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
               
            }
           
            else if(nums[i]==nums[i-1]+1)
            {
                cnt++;
            }
            else{
                
                cnt=1;
            }
            longest=Math.max(cnt,longest);
           
        }
        return longest;
        
    }
}