class Solution {
    public int countPairs(int[] nums, int k) {
        int count =0;
        // HashMap<Integer,Integer>mpp = new HashMap<>();//index,nums[index]
        for(int index =0;index<nums.length-1;index++)
        {
           for(int jindex=index+1;jindex<nums.length;jindex+=1)
           {
            if(nums[index]==nums[jindex])
            {
                int value =index*jindex;
                if(value% k ==0)
                {
                    count+=1;
                }
            }
           }
        }
        return count;
        
    }
}
/*
 if(mpp.containsKey(nums[index]))
            {
                int value = mpp.get(nums[index])*index;
                if((value % k)==0)
                {
                    count+=1;
                }
            }
            mpp.put(nums[index],index);
            */