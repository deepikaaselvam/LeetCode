class Solution {
    public int[] applyOperations(int[] nums) {
        for(int ind =0 ; ind<nums.length-1;ind++)
        {
            if(nums[ind]==nums[ind+1])
            {
                    nums[ind]=nums[ind]*2;
                    nums[ind+1]=0;
            }
               
        }
        int iIndex =0;
        int jIndex =0;
        while(jIndex<nums.length)
        {
           if(nums[jIndex]!=0)
            {
                int temp=nums[jIndex];
                nums[jIndex]=nums[iIndex];
                nums[iIndex]=temp;
                iIndex++;
            }
            jIndex++;
        }
        return nums;
      
    }
}