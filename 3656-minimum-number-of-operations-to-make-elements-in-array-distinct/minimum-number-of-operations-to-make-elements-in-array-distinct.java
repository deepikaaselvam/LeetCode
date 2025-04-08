class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int index =nums.length-1;index>=0;index-=1)
        {
            if(set.contains(nums[index]))
            {
                return index/3+1;
            }
            set.add(nums[index]);
        }
        return 0;
        // if(nums.length ==0)
        // {
        //     return 0;
        // }
        // return 0;
        
    }
}