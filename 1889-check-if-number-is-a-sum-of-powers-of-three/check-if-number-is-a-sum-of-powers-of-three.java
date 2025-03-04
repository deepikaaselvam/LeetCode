class Solution {
    public boolean checkPowersOfThree(int n) {
       if(n%3==2)
        {
            return false;
    
        }
        if(n/3==0 && n%3==0)
        {
            return true;
        }
        return checkPowersOfThree(n/3);
    }
}