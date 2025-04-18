class Solution {
    public int[] countBits(int n) {
        int[]ans = new int[n+1];
        for(int ind =0;ind<=n;ind+=1)
        {
            int cnt =0;
            int temp =ind;
            while(temp>=1)
            {
                int remainder = temp%2;
                if(remainder==1)
                {
                    cnt++;
                }
                temp =temp/2;
            }
            ans[ind]=cnt;
        }
        return ans;

        
    }
}