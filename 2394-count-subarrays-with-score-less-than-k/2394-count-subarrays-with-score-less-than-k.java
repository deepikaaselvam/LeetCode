class Solution {
    public long countSubarrays(int[] nums, long k) {
          long count = 0;
    long prefixSum = 0;
    int left = 0;
    
    for (int right = 0; right < nums.length; right++) {
        prefixSum += nums[right];
        while ((prefixSum * (right - left + 1)) >= k) {
            prefixSum -= nums[left];
            left++;
        }
        count += (right - left + 1);
    }
    return count;
        
    }
}
/*
ong cnt =0;
        for(int index =0;index<nums.length;index+=1)
        {
            long sum =0;
            long val =1;
            for(int jindex =index;jindex<nums.length;jindex+=1)
            {
                sum=sum+nums[jindex];
                long value=(sum * val++);
                if(value<k)
                {
                    cnt++;
                }
                else
                {
                    break;
                }
            }
        }
        return cnt;
        */