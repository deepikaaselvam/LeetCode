class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>array = new HashSet<>();
        for(int ind =0;ind<nums.length;ind++){
            array.add(nums[ind]);
        }
        int hashSetLength = array.size();
        // System.out.println(hashSetLength);
        int ans =nums[0];
        if(nums.length <3 || hashSetLength < 3){
            for(int ind =0;ind<nums.length-1;ind++){
                 ans = Math.max(ans,nums[ind+1]);
            }
            return ans;
        }
        int maximum =Integer.MIN_VALUE,secondMax = Integer.MIN_VALUE;
        int  thirdMax= Integer.MIN_VALUE;
        for(int ind =0;ind<nums.length;ind++){
            if(nums[ind]>maximum){
                thirdMax = secondMax;
                secondMax = maximum;
                maximum = nums[ind];

            }
            else if(nums[ind]>secondMax&& nums[ind]!=maximum){
              
                thirdMax = secondMax;
                secondMax = nums[ind];
            }
            else if(nums[ind]>thirdMax&& nums[ind]!=secondMax && nums[ind]!=maximum)
            {
                
                thirdMax = nums[ind];
            }
            // if(thirdMax<)
            System.out.println(maximum);
            System.out.println(secondMax);
            System.out.println(thirdMax);
        }
        return thirdMax;
        
    }
}