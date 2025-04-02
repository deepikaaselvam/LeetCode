class Solution {
    public long maximumTripletValue(int[] nums) {
        long maximum =Long.MIN_VALUE;
        long ans=0l;
        long result =0l;
        for(int index =0;index<=nums.length-3;index+=1)
        {
            for(int jIndex =index+1;jIndex<=nums.length-2;jIndex+=1)
            {
                for(int kIndex =jIndex+1;kIndex<nums.length;kIndex+=1)
                {
                    ans =(nums[index]-nums[jIndex]);
                    result = ans* nums[kIndex];
                    maximum =Math.max(maximum,result);
                }
            }
        }
        if(maximum <0)
        {
            return 0;
        }
        return maximum;
        
    }
}