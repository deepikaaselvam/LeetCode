class Solution {
      public static int getDigitSum(int val)
        {
            int sum=0;
            while(val>0)
            {
                sum+=val%10;
                val=val/10;
            }
            return sum;
        }
    public int maximumSum(int[] nums) {
      
        HashMap<Integer,Integer>sum_maxVal= new HashMap<>();
        int maximum=-1;
        for(int i=0;i<nums.length;i++)
        {
            int digit_sum=getDigitSum(nums[i]);
            if(sum_maxVal.containsKey(digit_sum))
            {
                maximum=Math.max(maximum,nums[i]+sum_maxVal.get(digit_sum));
                if(sum_maxVal.get(digit_sum)<nums[i])
                    sum_maxVal.put(digit_sum,nums[i]);
            }
            else
            {
                 sum_maxVal.put(digit_sum,nums[i]);
            }
        }
        return maximum;
        
    }
}