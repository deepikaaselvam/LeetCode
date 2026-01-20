public class Solution {
    public int ThirdMax(int[] nums) {
        long max = long.MinValue;
        long second =long.MinValue;
        long third = long.MinValue;
        for(int ind =0;ind<nums.Length;ind++){
            if(nums[ind]>max){
                third =second;
                second = max;
                max = nums[ind];
            }
            else if(nums[ind]>second && nums[ind]!=max){
                third = second ;
                second = nums[ind];
            }
            else if(nums[ind]>third && nums[ind]!=second && nums[ind]!=max){
                third= nums[ind];
            }
            
        }
        return third == long.MinValue ? (int)max : (int)third;
        
    }
}