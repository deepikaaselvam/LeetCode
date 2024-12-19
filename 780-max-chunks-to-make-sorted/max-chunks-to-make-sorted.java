class Solution {
    public int maxChunksToSorted(int[] nums) {
        int chunks =0;
        int maxElement=0;
        for(int i=0;i<nums.length;i++)
        {
            maxElement = Math.max(maxElement,nums[i]);
            if(maxElement==i)
            {
                chunks++;
            }
        }
        return chunks;
        
    }
}