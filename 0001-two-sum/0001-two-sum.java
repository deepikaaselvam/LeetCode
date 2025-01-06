class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer diff=(target-nums[i]);
            if(hash.containsKey(diff))
            {
                int ret[]={hash.get(diff),i};
                return ret;
            }
            hash.put(nums[i],i);
        }
        return null;
        
    }
}