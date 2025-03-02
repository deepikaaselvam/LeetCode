class Solution {
    public int largestInteger(int[] nums, int k) {
        int Len= nums.length;
        if(Len-k==0)
        {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int largest =-1;
        HashMap<Integer,Integer>mpp = new HashMap<>();
        int Length =nums.length;
        for(int index1 =0;index1<=Length-k;index1+=1)
        {
            for(int index2=index1;index2<(index1+k);index2+=1)
            {
                mpp.put(nums[index2],mpp.getOrDefault(nums[index2],0)+1);
              }
        }
        for (HashMap.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == 1) {
                largest = Math.max(largest, entry.getKey());
            }
        }
        return largest;
        
    }
 
        
    
}
/*
int left =0;
        int right =0;
        int Length = nums.length;
        HashMap<Integer,Integer>mpp = new HashMap<>();
        while(right<Length)
            {
                if(right<(right+k))
                {
                    if(mpp.containsKey(nums[right]))
                    {
                        mpp.add(nums[right],mpp.getOrDefault(nums[right],0)+1);
                    }
                    mpp.add(nums[right],mpp.getOrDefault(nums[right],0)+1);
                    right++;
                }
                else if( right>=k)
                {
                    left+=1;
                    right+=1;
                }
            }
        for(int i=0;i<mpp.size();i++)
            {
                int GettingNumber = mpp.get(nums[i]);
                getLargest(GettingNumber);
            }*/