class Solution {
    public int countOdds(int low, int high) {
        
        return((low%2==0 &&high%2!=0)||(low%2!=0  && high%2!=0))?((high/2)-(low/2)+1):((high/2)-(low/2));
      
        
    }
}
 /* if(low==high && low%2==0 && high%2==0)
        {
            return 0;
        }
        int cnt =0;
        //low =even ,high =even
        if(low%2 ==0 && high%2==0)
        {
            low=low+1;
            high = high-1;
            if(low==high)
            {
                return 1;
            }
            cnt+=2;
        }
        //low =odd ,high =odd
        else if(low%2!=0 && high%2!=0)
        {
            if(low ==high)
            {
                return 1;
            }
            cnt+=2;
        }
        else if(low%2==0 && high %2!=0)
        {
            low=low+1;
             if(low ==high)
            {
                return 1;
            }
            cnt+=2;
        }
        else if(low%2!=0 && high%2==0)
        {
            high = high -1;
             if(low ==high)
            {
                return 1;
            }
            cnt+=2;

        }

        while(low<high)
        {
            low+=2;
            high-=2;
            if(low>high)break;
            if(low==high)
            {
                cnt+=1;
                break;
            }
            else
            {
                cnt+=2;
            }
        }
        return cnt;  */