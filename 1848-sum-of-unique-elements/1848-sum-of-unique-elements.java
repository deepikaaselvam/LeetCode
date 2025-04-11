class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>mpp = new HashMap<>();
        for(int ind =0;ind<nums.length;ind+=1)
        {
            mpp.put(nums[ind],mpp.getOrDefault(nums[ind],0)+1);
        }
        for(int keyValue : mpp.keySet())
        {
            if(mpp.get(keyValue)==1)
            {
                sum+=keyValue;
            }
        }
        return sum;
        
    }
}