class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]<nums[nums.length-1])
        {
            for(int index =0;index<nums.length-1;index+=1)
            {
                if(nums[index]>nums[index+1])
                {
                    return false;
                }
            }
        }
        else{
            for(int index =0;index<nums.length-1;index+=1)
            {
                if(nums[index]<nums[index+1])
                {
                    return false;
                }
            }
        }
        return true;




/*
        int cnt1=1;
        int cnt2=1;
        for(int index =0;index<nums.length-1 ;index+=1)
        {
            if(nums[index]>=nums[index+1])
               cnt1+=1;
        }
        if(cnt1==nums.length)
        {
            return true;
        }
        if(cnt1!=nums.length)
        {
            for(int index2=0;index2<nums.length-1;index2+=1)
            {
                if(nums[index2]<=nums[index2+1])
                cnt2+=1;
            }
        }
      
        if(cnt2==nums.length)
        {
            return true;
        }
        return false; */
        
    }
}

/*
if((nums[index]<=nums[index+1] && nums[index+1]>nums[index+2]) 
                 || (nums[index]>nums[index+1] && nums[index+1] <nums[index+2]))
                 {
                    return false;
                 }
                 */