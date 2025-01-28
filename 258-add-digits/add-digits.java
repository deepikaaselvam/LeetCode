class Solution {
    public int addDigits(int num) {
        // if(num>=1 && num<10){
        //     return num;
        // }
        // while(num>=10)
        //     {
        //         int sum=0;
        //         int rem=num%10;
        //         int quot=num/10;
        //         sum=rem+quot;
        //         num=sum;
        //     }
     
        // return num;

        //construct 1 to 50 digits,Calculate the sum of digits between them ...It will repeatedly provide 0 to 9
        if(num==0)
        {
            return 0;
        }
        int ans = num %9;
        if(ans==0)
        {
            return 9;
        }
        return ans;
        
    }
}