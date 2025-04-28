class Solution {
     public int subarraySum(int[] nums, int k) {
        if(nums.length==1 && k==0)
        {
            return 0;
        }
        if(nums.length==1 && nums[0]==k)
        {
            return k;
        }
        HashMap<Integer,Integer>mpp = new HashMap<>();
        int cnt =0;
        int prefixSum =0;
        mpp.put(0,1);
        for(int ind =0;ind<nums.length;ind+=1)
        {
            prefixSum +=nums[ind];
            int anyPreviousValue = prefixSum -k;
            if(mpp.containsKey(anyPreviousValue))
            {
                cnt +=mpp.get(anyPreviousValue);
            }

            mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
       
     }

   
}
/* int left =0;
        int right =0;
        int sum =0;
        int count =0;
        while(right<nums.length)
        {
            sum=sum+nums[right];
            while(sum>k && left <=right)
            {
                sum-=nums[left];
                left+=1;
            }
            if(sum==k)
            {
                count =count+1;
            }
            right+=1;
        }
        return count;
        */



/*
 private static int subArraySumEqualsK(int index,int sum,int[]nums,int k)
    {
        if(index==nums.length)
        {
            int value =0;
            if(sum==k)
            {
               value = value+1;
               
            }
            return value;
        }
            sum=sum+nums[index];
            int cnt1 =subArraySumEqualsK(index+1,sum,nums,k);
            sum = sum - nums[index];
            int cnt2= subArraySumEqualsK(index+1,sum,nums,k);
            return cnt1+cnt2;
            
        
    }
    public int subarraySum(int[] nums, int k) {
        int sum =0;
        return subArraySumEqualsK(0,sum,nums,k);
        
        
    }*/

    /*
    int prefixSum[] =new int[nums.length];
        int suffixSum[] = new int[nums.length];
        prefixSum[0]=0;
        int cnt =0;
        for(int ind =1;ind<nums.length;ind+=1)
        {
            prefixSum[ind]=prefixSum[ind-1]+nums[ind-1];
            if(prefixSum[ind]==k) cnt+=1;
        }
        suffixSum[nums.length-1]=0;
        for(int ind =nums.length-2;ind>=0;ind-=1)
        {
            suffixSum[ind]=suffixSum[ind+1]+nums[ind+1];
            if(suffixSum[ind]==k) cnt++;
        }
        return cnt;
        */