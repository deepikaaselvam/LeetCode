class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int index:nums)
        {
            rightSum +=index;
        }
        for(int index =0;index<nums.length;index+=1)
        {
            int value = nums[index];
            rightSum-=value;
            if(leftSum==rightSum)
            {
                return index;
            }
            leftSum+=value;
        }
     
        return -1;

        
    }
}


/*
   int [] prefixSum = new int[nums.length];
        int [] suffixSum = new int[nums.length];
        prefixSum[0]=0;
        suffixSum[nums.length-1]=0;
        for(int i=1;i<nums.length;i+=1)
        {
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }
        for(int ind = nums.length-2;ind>=0;ind-=1)
        {
            suffixSum[ind]=suffixSum[ind+1]+nums[ind+1];
        }
        for(int ind2 =0;ind2<nums.length;ind2+=1)
        {
            if(prefixSum[ind2]==suffixSum[ind2])
            {
                return ind2;
            }
        }
 */