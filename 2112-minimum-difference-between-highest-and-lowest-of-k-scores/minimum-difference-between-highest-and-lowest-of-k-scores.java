class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1 && k==1)
        {
            return 0;
        }
        int minimum =Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int ind =0;ind<=nums.length-k;ind+=1)
        {
            int val1 = nums[ind];
            int val2 = nums[ind+(k-1)];
            int answer= Math.abs(val1-val2);
            minimum =Math.min(minimum,answer);      
        }
        return minimum;    
    }
}
// for(int ind =0;ind<nums.length-1;ind+=1)
        // {
        //     for(int jind = ind+1 ;jind<nums.length;jind+=1)
        //     {
        //         int ans = Math.abs(nums[ind]- nums[jind]);
        //         minimum =Math.min(minimum,ans);
        //     }
        // }
        // return minimum;
        