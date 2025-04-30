class Solution {
    private int getDivisiblePairs(List<Integer>previousIndex,int currentIndex,int k)
    {
        int count=0;
        for(int previous:previousIndex)
        {
            count+=((previous*currentIndex)%k==0)?1:0;
        }
        return count;
    }

    public int countPairs(int[] nums, int k) {
        int count =0;
        HashMap<Integer,List<Integer>>mpp = new HashMap<>();//index,nums[index]
        for(int ind =0;ind<nums.length;ind+=1)
        {
            if(mpp.containsKey(nums[ind]))
            {
                count+=getDivisiblePairs(mpp.get(nums[ind]),ind,k);
            }
            mpp.computeIfAbsent(nums[ind],xval->new ArrayList<>()).add(ind);
        }
        return count;
       
    }
}
/*
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
        
        */
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