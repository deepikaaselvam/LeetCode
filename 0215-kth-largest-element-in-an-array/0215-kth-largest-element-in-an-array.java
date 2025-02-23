class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length<k)
        {
            return -1;
        }
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k)
            {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
        
    }
}