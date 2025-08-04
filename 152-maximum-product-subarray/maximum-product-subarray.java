class Solution {
    public int maxProduct(int[] nums) {
        int prefixArray[] = new int[nums.length];
        int suffixArray[]= new int[nums.length];
        prefixArray[0]=nums[0];
        suffixArray[nums.length-1]=nums[nums.length-1];
        for(int ind =1;ind<nums.length;ind+=1)
        {
            if(prefixArray[ind-1]==0)
            {
                prefixArray[ind]=1*nums[ind];
            }
            else{
                prefixArray[ind]=prefixArray[ind-1]*nums[ind];
            }
            
        }
        for(int ind = nums.length-2;ind>=0;ind-=1)
        {
            if(suffixArray[ind+1]==0)
            {
                suffixArray[ind]=1*nums[ind];
            }
            else
            {
                suffixArray[ind]=suffixArray[ind+1]*nums[ind];
            }
            
        }
        int maximum =Integer.MIN_VALUE;
        for(int ind =0;ind<nums.length;ind+=1)
        {
            maximum = Math.max(maximum,Math.max(prefixArray[ind],suffixArray[ind]));
        }
        
        return maximum;
    }
}