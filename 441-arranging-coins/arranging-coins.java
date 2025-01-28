class Solution {
    public int arrangeCoins(int coins) {
        int cnt=0;
        for(int row=1;row<=coins;row++)
        {
            if(coins<row)
            {
                return cnt;
            }
            coins=coins-row;
            cnt++;
        }
        return cnt;
        
    }
}