class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0l;
        int l=0,r=0;
        HashSet<Integer>set = new HashSet<>();
        long maximum=Long.MIN_VALUE;
       
        while(r<nums.length)
        {
            while(set.contains(nums[r]))
                {
                    
                    sum-=nums[l];
                    set.remove(nums[l]);
                    l++;
                }
                set.add(nums[r]);
                sum+=nums[r];
               
              
            
            if(r-l+1==k)
            {
                maximum=Math.max(sum,maximum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
               
               
            }
            r++;
        }
       return maximum == Long.MIN_VALUE? 0 :maximum;
        
    }
}