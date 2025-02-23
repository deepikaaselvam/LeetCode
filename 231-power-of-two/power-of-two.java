class Solution {
   public static boolean isPowerofTwoo(int qn)
    {
        // int ans=qn%2;
        if(qn==1)
        {
            return true;
        }
        if(qn%2!=0)
        {
            return false;
        }
        
        
        
        return isPowerofTwoo(qn/2);
     }
    
    public  boolean isPowerOfTwo(int n) {
        // int value =n;
        if(n<1)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        boolean ans= isPowerofTwoo(n);
        return ans;

            
        
    }
   
   
}


// if(value == powerValuee)
        // {
        //     return true;
        // }
        // if(powerValuee>value) return false;