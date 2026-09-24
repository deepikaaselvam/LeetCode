class Solution {
    public int smallestIndex(int[] nums) {
        for(int index = 0;index< nums.length;index++){
            int num = nums[index];
            int sum =0;
            while(num > 0){
                sum += num%10;
                num = num/10;
            }
            if(sum == index){
                return index;
            }
        }
        return -1;
        
    }
}