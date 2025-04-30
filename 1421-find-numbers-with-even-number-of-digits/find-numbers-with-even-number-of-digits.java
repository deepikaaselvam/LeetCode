class Solution {
    public int findNumbers(int[] nums) {
        int evenDigit =0;
        for(int index =0;index<nums.length;index+=1)
        {
            if((nums[index]>9&&nums[index]<100)||
            (nums[index]>999 && nums[index]<10000)||
            (nums[index]==100000))
            {
                evenDigit+=1;
            }
        }
        return evenDigit;
        
    }
}