class Solution {
    
    public boolean check(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%nums.length])//Logic of is to be sorted  
            {
                cnt++;
            }
           

        }
        if(cnt>1)
        {
            return false;
        }
        return true;
       
        
    }
   
}