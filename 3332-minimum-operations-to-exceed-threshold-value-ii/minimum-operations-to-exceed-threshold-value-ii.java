class Solution {
  
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>minHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            minHeap.add((long)nums[i]);
        }
        int numOfOperations =0;
        while(minHeap.peek()<k)
        {
            long x = minHeap.remove();
            long y = minHeap.remove();
            minHeap.add(x*2+y);

            numOfOperations++;
        }
        return numOfOperations;
       

        
    }
}
  // public static ArrayList<Integer> getTwoSmallestElement(ArrayList<Integer>nums1)
    // {
    //     // int small=Integer.MAX_VALUE;
    //     // int sec_small= Integer.MAX_VALUE;
    //     // for(int i=0;i<nums1.size();i++)
    //     // {
    //     //     if(nums1.get(i)<small)
    //     //     {
    //     //         sec_small=small;
    //     //         small=nums1.get(i);
    //     //     }
    //     //     else if(nums1.get(i)>small && nums1.get(i)<sec_small)
    //     //     {
    //     //         sec_small = nums1.get(i);
    //     //     }
    //     // }
    // }