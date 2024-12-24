class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg;
        int i=0,j=0;
        double sum=0.0;
        int maximum=0;
        for(j=0;j<k;j++)
        {
            sum+=nums[j];
        }
        avg = (sum/k);
        for(j=k;j<nums.length;j++)
        {
            sum = sum - nums[i];
            i++;
            sum+=nums[j];
            avg= Math.max(avg,(sum/k));
        }
        return avg;
       
        
    }
}