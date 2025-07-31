class Solution {
    public int trap(int[] nums) {
         int[]leftMax=new int[nums.length];
        int []rightMax= new int[nums.length];
        leftMax[0]=nums[0];
        for(int ind =1;ind<nums.length;ind+=1)
        {
            leftMax[ind]=Math.max(leftMax[ind-1],nums[ind]); 
        }
        rightMax[nums.length-1]=nums[nums.length-1];
        for(int ind =nums.length-2;ind>=0;ind-=1)
        {
            rightMax[ind]=Math.max(rightMax[ind+1],nums[ind]);
        }
        //Answer
        int total =0;
        for(int ind =0;ind<nums.length;ind+=1)
        {
            if(nums[ind]<leftMax[ind]&& nums[ind]<rightMax[ind])
            {
                total+=Math.min(leftMax[ind],rightMax[ind])-nums[ind];
            }
        }
        return total;
        
    }
}