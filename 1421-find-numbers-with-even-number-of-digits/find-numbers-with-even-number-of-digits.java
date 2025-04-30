class Solution {
    public int findNumbers(int[] nums) {
        int evenDigit =0;
        for(int number:nums)
        {
            if((number>9&&number<100)||
            (number>999 && number<10000)||
            (number==100000))
            {
                evenDigit+=1;
            }
        }
        return evenDigit;
        
    }
}