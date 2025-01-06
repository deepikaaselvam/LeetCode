class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer diff=(target-nums[i]);
            if(mpp.containsKey(diff))
            {
                int ret[]={mpp.get(diff),i};
                return ret;
            }
            mpp.put(nums[i],i);
        }
        return null;
        
    }
}
