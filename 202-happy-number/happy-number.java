class Solution {
    public boolean isHappy(int n) {
        if(n==2||n==3||n==4)
        {
            return false;
        }
        int digit=n;
 int cnt=0;       
while(digit!=1)
{
    if(cnt>=1)
    {
        n=digit;
    }

     if(digit==2||digit==3||digit==4)
        {
            return false;
        }
    int sum =0;
    while(n>0)
      {
        int remainder =n%10;
        int square =remainder*remainder;
        sum+=square;
        n=n/10;
        cnt++;

      }
      digit = sum;
        
    }
    return true;


}
      
}