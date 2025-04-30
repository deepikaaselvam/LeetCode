class Solution {
    public int findNumbers(int[] nums) {
        int evenDigit =0;
        for(int index =0;index<nums.length;index+=1)
        {
            int temporary= nums[index];
            int cnt =0;
            while(temporary>0)
            {
                int rem = temporary%10;
                cnt+=1;
                temporary=temporary/10;
            }
            if(cnt%2==0)
            {
                evenDigit+=1;
            }
        }
        return evenDigit;
        
    }
}