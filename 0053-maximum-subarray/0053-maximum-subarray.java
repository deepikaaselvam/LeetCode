class Solution {
    public int maxSubArray(int[] nums) {//kadane's algorithm
        int maximum=Integer.MIN_VALUE;int sum=0;
        for(int i=0 ; i<nums.length;i++)
        {
            sum+=nums[i];
            maximum=Math.max(maximum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
   
   
      
       
        return maximum;
    }
}