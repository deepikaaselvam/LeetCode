class Solution {
    public boolean divideArray(int[] nums) {
        //Array 
        int[]frequency = new int[501];
        for(int index =0;index<nums.length;index+=1)
        {
            frequency[nums[index]]+=1;
        }
        for(int i =0;i<frequency.length;i+=1)
        {
            if(frequency[i]%2!=0)
            {
                return false;
            }
        }
        return true;
    }
    //     //HashMap
    //     HashMap<Integer,Integer>mpp = new HashMap<>();
    //     for(int index =0;index<nums.length;index+=1)
    //     {
    //         mpp.put(nums[index],mpp.getOrDefault(nums[index],0)+1);
    //     }
    //     for(int cnt:mpp.values())
    //     {
    //         if(cnt%2!=0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //   //xor gate;
    //   int xor =0;
    //   for(int index =0;index<nums.length ;index+=1)
    //   {
    //      xor =xor^nums[index];
    //   }
    //   if(xor!=0)
    //   {
    //     return false;
    //   }
    //   return true;
        
    // }
}