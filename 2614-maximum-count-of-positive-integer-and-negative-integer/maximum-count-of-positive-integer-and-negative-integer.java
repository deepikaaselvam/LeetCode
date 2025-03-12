class Solution {
    public int maximumCount(int[] nums) {
        int minL = 0;
        int maxR = 0;
        for(int ind =0;ind <nums.length ;ind +=1)
        {
            if(nums[ind]<0)
            {
                minL+=1;
            }
            if(nums[ind]>0)
            {
                maxR+=1;
            }
        }
        int maximum = Math.max(minL,maxR);
        return maximum;
        
        
    }
}
/*
int low =0;
        int high = nums.length-1;
        int maximumL = Integer.MIN_VALUE;
        int maximumR = Integer.MIN_VALUE;
        while(low<=high)
        {
            int mid = ((high -low)+1)/2;
            if(nums[mid] == 0)
            {
                high = mid -1;
                // low  = mid +1;
                maximumL = (high - low)+ 1;
            }
            else {
                mid =high;

            }
        }
*/