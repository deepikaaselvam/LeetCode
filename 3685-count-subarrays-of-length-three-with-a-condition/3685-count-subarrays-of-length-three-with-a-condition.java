class Solution {
    public int countSubarrays(int[] nums) {
        int cnt =0;
        for(int index=0;index<nums.length-2;index+=1)
        {
            int first =nums[index];
            int last = nums[index+2];
            int mid = nums[index+1];
            int value=first+last;
            if((value*2)==mid)
            {
                cnt++;
            }

        }
        return cnt;
    }
}