class Solution {
    public int waysToSplitArray(int[] array) {
         long[]prefixSum=new long[array.length];
        int cnt=0;
        long sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
            prefixSum[i]=sum;
        }
        int l=0;
        while(l<array.length-1)
        {
            if(prefixSum[l]>=prefixSum[array.length-1]-prefixSum[l])
                {
                    cnt++;
                }
            l++;
        }
        return cnt;
        
    }
}